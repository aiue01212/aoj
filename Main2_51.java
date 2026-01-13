import java.util.Scanner;

public class Main2_51 {

    static boolean canMake(int[] A, int index, int target) {
        if (target == 0)
            return true;
        if (index == A.length)
            return false;

        if (canMake(A, index + 1, target - A[index])) {
            return true;
        }

        return canMake(A, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();
            if (canMake(A, 0, m)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
