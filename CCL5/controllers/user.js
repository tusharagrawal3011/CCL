const nodemailer = require('nodemailer');
const userModel = require('../models/user');

//register
module.exports.register = async (req, res) => {
    let insertedId = await userModel.insert(req.body);
    if(insertedId > 0){
        res.send({status:"success", data:{id:insertedId}});
    } else {
        res.send({status:"error", message:"User registration failed"});
    }
}

//get
module.exports.get = async (req, res) => {

    let data = await userModel.get(req.body);
    if(data){
        res.send({status:"success", data:data});
    } else {
        res.send({status:"error", message:"User not found"});
    }
}

//update
module.exports.update = async (req, res) => {

    let status = await userModel.update(req.body);
    if(status){
        let mailTransporter=nodemailer.createTransport({
            service:'gmail',
            auth:{
                user:'sendergmailid',
                pass:'sendergmailpassword'
            }
        });
        
        let mailDetails={
            from:'sendergmailid',
            to:req.body.email,//mail taken while updation
            subject:'Mail from the server',
            text:'Your details have been modified'
        };
        
        mailTransporter.sendMail(mailDetails,function(err,data){
            if(err){
                console.log(err);
            }else{
                console.log("email sent successfully");
            }
        });
        res.send({status:"success", message:"User data updated"});
    } else {
        res.send({status:"error", message:"User not updated"});
    }
}

//delete
module.exports.delete = async (req, res) => {
    
    let status = await userModel.delete(req.body);
    if(status){
        res.send({status:"success", message:"User deleted!"});
    } else {
        res.send({status:"error", message:"User not deleted"});
    }
}