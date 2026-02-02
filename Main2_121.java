import java.util.*;

public class Main2_121 {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        boolean[] used = new boolean[n];
        int[] min = new int[n];

        Arrays.fill(min, INF);
        min[0] = 0;

        int result = 0;

        for (int i = 0; i < n; i++) {
            int v = -1;

            for (int u = 0; u < n; u++) {
                if (!used[u] && (v == -1 || min[u] < min[v])) {
                    v = u;
                }
            }

            used[v] = true;
            result += min[v];

            for (int u = 0; u < n; u++) {
                if (!used[u] && A[v][u] != -1) {
                    min[u] = Math.min(min[u], A[v][u]);
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}