import java.util.Scanner;

public class Main72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {
            int result = 0;
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            if (x == 0 && n == 0) {
                break;
            }

            for (int j = 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    for (int l = k + 1; l <= n; l++) {
                        if (j + k + l == x) {
                            result++;
                        }
                    }
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
