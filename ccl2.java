import java.util.Scanner;

class ccl2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int d = 0, s = 0;
        while (n != 0) {
            d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        if (s == num)
            System.out.println("Palindrome no.");
        else
            System.out.println("Not a Palindrome no.");
    }
}
