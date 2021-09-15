const express = require('express');

const userRoute = require('./routers/user');

const app = express();

app.use(express.json());

// localhost:3000/
app.get('/',(req, res)=>{
    res.send("Server is Working!");
});

// localhost:3000/user/...
app.use('/user', userRoute);

app.listen(3000);
