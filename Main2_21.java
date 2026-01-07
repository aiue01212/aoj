import java.util.Scanner;

public class Main2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int j = N - 1; j >= 1; j--) {
                if (A[j] < A[j - 1]) {
                    int tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                    count++;
                    flag = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();

        System.out.println(count);

        sc.close();
    }
}