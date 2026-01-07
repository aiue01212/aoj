import java.util.Scanner;

public class Main74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[][] B = new int[m][l];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        long[][] result = new long[n][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                result[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(result[i][j]);
                if (j != l - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
