import java.util.*;

public class Main2_73 {
    static int[] left;
    static int[] right;
    static List<Integer> preorderList = new ArrayList<>();
    static List<Integer> inorderList = new ArrayList<>();
    static List<Integer> postorderList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        left = new int[n];
        right = new int[n];
        int[] parent = new int[n];

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

        preorder(root);
        inorder(root);
        postorder(root);

        System.out.println("Preorder");
        printList(preorderList);
        System.out.println("Inorder");
        printList(inorderList);
        System.out.println("Postorder");
        printList(postorderList);

        sc.close();
    }

    static void preorder(int u) {
        if (u == -1)
            return;
        preorderList.add(u);
        preorder(left[u]);
        preorder(right[u]);
    }

    static void inorder(int u) {
        if (u == -1)
            return;
        inorder(left[u]);
        inorderList.add(u);
        inorder(right[u]);
    }

    static void postorder(int u) {
        if (u == -1)
            return;
        postorder(left[u]);
        postorder(right[u]);
        postorderList.add(u);
    }

    static void printList(List<Integer> list) {
        for (int v : list) {
            System.out.print(" " + v);
        }
        System.out.println();
    }
}
