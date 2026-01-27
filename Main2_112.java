import java.util.*;

public class Main2_112 {

    static int n;
    static List<Integer>[] a;
    static boolean[] visited;
    static int[] d, f;
    static int time = 0;

    static void dfs(int u) {
        visited[u] = true;
        d[u] = ++time;

        for (int v : a[u]) {
            if (!visited[v]) {
                dfs(v);
            }
        }

        f[u] = ++time;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = (List<Integer>[]) new ArrayList[n + 1];
        visited = new boolean[n + 1];
        d = new int[n + 1];
        f = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                a[u].add(v);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + d[i] + " " + f[i]);
        }

        sc.close();
    }
}
