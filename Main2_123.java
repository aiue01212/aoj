import java.io.*;
import java.util.*;

public class Main2_123 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int u = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int j = 0; j < k; j++) {
                int v = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                graph.get(u).add(new int[] { v, c });
            }
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>(
                (a, b) -> Long.compare(a[0], b[0]));

        pq.add(new long[] { 0, 0 });

        while (!pq.isEmpty()) {
            long[] c = pq.poll();
            long v = c[0];
            int u = (int) c[1];

            if (v > dist[u])
                continue;

            for (int[] edge : graph.get(u)) {
                int to = edge[0];
                int cost = edge[1];

                if (dist[to] > dist[u] + cost) {
                    dist[to] = dist[u] + cost;
                    pq.add(new long[] { dist[to], to });
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }
}
