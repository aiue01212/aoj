import java.util.Scanner;

public class Main2_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            if (A[i] > max)
                max = A[i];
        }

        int[] B = new int[n];
        int[] C = new int[max + 1];

        for (int j = 0; j < n; j++) {
            C[A[j]]++;
        }

        for (int i = 1; i <= max; i++) {
            C[i] += C[i - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]]--;
        }

        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(B[i]);
        }
        System.out.println();

        sc.close();
    }
}