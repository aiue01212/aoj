import java.util.Scanner;

public class Main2_101 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            if (n == 0 || n == 1) {
                System.out.println(1);
                return;
            }

            long a = 1;
            long b = 1;

            for (int i = 2; i <= n; i++) {
                long c = a + b;
                a = b;
                b = c;
            }

            System.out.println(b);
        }
    }
}