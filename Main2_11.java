import java.util.Scanner;

public class Main2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        printArray(A);

        for (int i = 1; i < N; i++) {
            int v = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;

            printArray(A);
        }

        sc.close();
    }

    static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();
    }
}
