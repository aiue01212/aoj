import java.util.Scanner;

public class Main2_103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());

        for (int l = 0; l < q; l++) {
            String X = sc.nextLine();
            String Y = sc.nextLine();

            int m = X.length();
            int n = Y.length();

            int[][] dp = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            System.out.println(dp[m][n]);
        }

        sc.close();
    }
}
