import java.util.Scanner;

class ccl3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (a[i] == a[j]) {
                    c++;
                    a[j] = a[j + 1];
                }
            }
        }
        n = n - c;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}
