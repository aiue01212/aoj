import java.util.*;

public class Main2_74 {

    static int[] preorder;
    static int[] inorder;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        preorder = new int[n];
        inorder = new int[n];

        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        build(0, n - 1, 0, n - 1);

        System.out.println(sb.toString().trim());

        sc.close();
    }

    static void build(int preStart, int preEnd, int inStart, int inEnd) {

        if (preStart > preEnd || inStart > inEnd)
            return;

        int root = preorder[preStart];

        int rootIndex = -1;

        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root) {
                rootIndex = i;
                break;
            }
        }

        int leftSize = rootIndex - inStart;

        build(preStart + 1,
                preStart + leftSize,
                inStart,
                rootIndex - 1);

        build(preStart + leftSize + 1,
                preEnd,
                rootIndex + 1,
                inEnd);

        sb.append(root).append(" ");
    }
}