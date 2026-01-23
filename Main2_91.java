import java.util.Scanner;

public class Main2_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int[] A = new int[H + 1];

        for (int i = 1; i <= H; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i <= H; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("node ").append(i).append(": key = ").append(A[i]);

            if (i != 1) {
                sb.append(", parent key = ").append(A[i / 2]);
            }

            int left = 2 * i;
            if (left <= H) {
                sb.append(", left key = ").append(A[left]);
            }

            int right = 2 * i + 1;
            if (right <= H) {
                sb.append(", right key = ").append(A[right]);
            }

            sb.append(", ");
            System.out.println(sb.toString());
        }

        sc.close();
    }
}
