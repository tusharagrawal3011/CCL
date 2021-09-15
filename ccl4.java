import java.util.Scanner;

class ccl4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = ' ';
        int c = 0;
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                ch1 = (char) i;
                if (ch1 == ch) {
                    c++;
                    break;
                }
            }
            if (c == 0)
                System.out.println(ch1);
            else
                c = 0;
        }
    }
}
