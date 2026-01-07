import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += A[i][j] * b[j];
            }
            result[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}
