import java.util.Scanner;

public class Main2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean prime = true;

            if (x % 2 == 0) {
                if (x == 2) {
                    prime = true;
                } else {
                    prime = false;
                }
            } else {
                for (int j = 3; j * j <= x; j = j + 2) {
                    int r = x % j;
                    if (r == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
