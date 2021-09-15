import java.util.Scanner;

class ccl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0, s = 0;
        while (n != 0) {
            d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        System.out.println("Output=" + s);
    }
}
