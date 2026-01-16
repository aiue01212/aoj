import java.util.Scanner;

public class Main2_72 {

    static int n;
    static int[] left, right, parent, depth, height;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        left = new int[n];
        right = new int[n];
        parent = new int[n];
        depth = new int[n];
        height = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = right[i] = parent[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            left[id] = l;
            right[id] = r;

            if (l != -1)
                parent[l] = id;
            if (r != -1)
                parent[r] = id;
        }

        int root = -1;
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                root = i;
                break;
            }
        }

        setDepth(root, 0);

        setHeight(root);

        for (int i = 0; i < n; i++) {
            int deg = 0;
            if (left[i] != -1)
                deg++;
            if (right[i] != -1)
                deg++;

            int sibling = -1;
            if (parent[i] != -1) {
                if (left[parent[i]] == i)
                    sibling = right[parent[i]];
                else
                    sibling = left[parent[i]];
            }

            String type;
            if (parent[i] == -1)
                type = "root";
            else if (deg == 0)
                type = "leaf";
            else
                type = "internal node";

            System.out.println(
                    "node " + i +
                            ": parent = " + parent[i] +
                            ", sibling = " + sibling +
                            ", degree = " + deg +
                            ", depth = " + depth[i] +
                            ", height = " + height[i] +
                            ", " + type);
        }

        sc.close();
    }

    static void setDepth(int u, int d) {
        depth[u] = d;

        if (left[u] != -1)
            setDepth(left[u], d + 1);
        if (right[u] != -1)
            setDepth(right[u], d + 1);
    }

    static int setHeight(int u) {
        int h1 = 0, h2 = 0;

        if (left[u] != -1)
            h1 = setHeight(left[u]) + 1;
        if (right[u] != -1)
            h2 = setHeight(right[u]) + 1;

        height[u] = Math.max(h1, h2);
        return height[u];
    }
}
