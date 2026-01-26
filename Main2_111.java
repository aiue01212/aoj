import java.util.*;

public class Main2_111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] M = new int[n][n];

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();

            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                M[u - 1][v - 1] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0)
                    System.out.print(" ");
                System.out.print(M[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
