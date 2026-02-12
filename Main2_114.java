import java.util.*;

public class Main2_114 {

    static List<List<Integer>> graph;
    static int[] component;
    static boolean[] visited;
    static int currentComponent = 0;

    public static void dfs(int start) {

        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int v = stack.pop();

            if (visited[v])
                continue;

            visited[v] = true;
            component[v] = currentComponent;

            for (int next : graph.get(v)) {
                if (!visited[next]) {
                    stack.push(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            graph.get(s).add(t);
            graph.get(t).add(s);
        }

        visited = new boolean[n];
        component = new int[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                currentComponent++;
            }
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();

            if (component[s] == component[t]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
