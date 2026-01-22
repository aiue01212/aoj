import java.util.*;

public class Main2_82 {
    static int MAX = 500001;
    static int[] keys = new int[MAX];
    static int[] left = new int[MAX];
    static int[] right = new int[MAX];
    static int[] parent = new int[MAX];
    static List<Integer> inorderList = new ArrayList<>();
    static List<Integer> preorderList = new ArrayList<>();
    static int count = 0;
    static int root = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            left[i] = right[i] = parent[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (line.startsWith("insert")) {
                int key = Integer.parseInt(line.split(" ")[1]);
                insert(key);
            } else if (line.startsWith("find")) {
                int key = Integer.parseInt(line.split(" ")[1]);
                if (find(key)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (line.equals("print")) {
                inorderList.clear();
                preorderList.clear();

                inorder(root);
                preorder(root);

                printList(inorderList);
                printList(preorderList);
            } else {
            }
        }

        sc.close();
    }

    static void insert(int key) {
        int z = count;
        keys[z] = key;
        left[z] = -1;
        right[z] = -1;
        parent[z] = -1;

        int y = -1;
        int x = root;

        while (x != -1) {
            y = x;
            if (key < keys[x]) {
                x = left[x];
            } else {
                x = right[x];
            }
        }

        parent[z] = y;
        if (y == -1) {
            root = z;
        } else if (key < keys[y]) {
            left[y] = z;
        } else {
            right[y] = z;
        }

        count++;
    }

    static boolean find(int key) {
        int x = root;

        while (x != -1) {
            if (key == keys[x]) {
                return true;
            } else if (key < keys[x]) {
                x = left[x];
            } else {
                x = right[x];
            }
        }
        return false;
    }

    static void inorder(int u) {
        if (u == -1)
            return;
        inorder(left[u]);
        inorderList.add(keys[u]);
        inorder(right[u]);
    }

    static void preorder(int u) {
        if (u == -1)
            return;
        preorderList.add(keys[u]);
        preorder(left[u]);
        preorder(right[u]);
    }

    static void printList(List<Integer> list) {
        for (int v : list) {
            System.out.print(" " + v);
        }
        System.out.println();
    }
}
