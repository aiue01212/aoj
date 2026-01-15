import java.util.*;

public class Main2_71 {

    static int[] parent;
    static int[] depth;
    static List<List<Integer>> children;

    static void depth(int u, int d) {
        depth[u] = d;
        for (int v : children.get(u)) {
            depth(v, d + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        parent = new int[n];
        depth = new int[n];
        children = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            parent[i] = -1;
            children.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int c = sc.nextInt();
                children.get(id).add(c);
                parent[c] = id;
            }
        }

        int root = -1;
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                root = i;
                break;
            }
        }

        depth(root, 0);

        for (int i = 0; i < n; i++) {
            String type;
            if (parent[i] == -1) {
                type = "root";
            } else if (children.get(i).isEmpty()) {
                type = "leaf";
            } else {
                type = "internal node";
            }

            System.out.print("node " + i + ": ");
            System.out.print("parent = " + parent[i] + ", ");
            System.out.print("depth = " + depth[i] + ", ");
            System.out.print(type + ", [");

            for (int j = 0; j < children.get(i).size(); j++) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print(children.get(i).get(j));
            }
            System.out.println("]");
        }

        sc.close();
    }
}
