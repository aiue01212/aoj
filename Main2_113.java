import java.util.*;

public class Main2_113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                graph.get(u).add(v);
            }
        }

        int[] dist = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dist[i] = -1;
        }

        dist[1] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : graph.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    queue.add(v);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + dist[i]);
        }

        sc.close();
    }
}
