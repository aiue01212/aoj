import java.util.Scanner;

public class Main73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                A[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += A[i][j];
            }
            A[i][m] = sum;
        }

        for (int j = 0; j < m + 1; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += A[i][j];
            }
            A[n][j] = sum;
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(A[i][j]);
                if (j != m) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
