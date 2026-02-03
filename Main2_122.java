import java.util.*;

public class Main2_122 {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        @SuppressWarnings("unchecked")
        ArrayList<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int v = sc.nextInt();
                int c = sc.nextInt();
                graph[u].add(new int[] { v, c });
            }
        }

        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        pq.add(new int[] { 0, 0 });

        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            int v = c[0];
            int d = c[1];

            if (d > dist[v])
                continue;

            for (int[] edge : graph[v]) {
                int to = edge[0];
                int cost = edge[1];

                if (dist[to] > dist[v] + cost) {
                    dist[to] = dist[v] + cost;
                    pq.add(new int[] { to, dist[to] });
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + dist[i]);
        }

        sc.close();
    }
}
