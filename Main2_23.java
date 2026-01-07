import java.util.Scanner;

public class Main2_23 {

    static void bubbleSort(String[] C, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                if (C[j].charAt(1) < C[j - 1].charAt(1)) {
                    String tmp = C[j];
                    C[j] = C[j - 1];
                    C[j - 1] = tmp;
                }
            }
        }
    }

    static void selectionSort(String[] C, int N) {
        for (int i = 0; i < N; i++) {
            int minj = i;
            for (int j = i; j < N; j++) {
                if (C[j].charAt(1) < C[minj].charAt(1)) {
                    minj = j;
                }
            }
            String tmp = C[i];
            C[i] = C[minj];
            C[minj] = tmp;
        }
    }

    static void print(String[] C, int N) {
        for (int i = 0; i < N; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(C[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] C = new String[N];

        for (int i = 0; i < N; i++) {
            C[i] = sc.next();
        }

        String[] bubble = C.clone();
        String[] selection = C.clone();

        bubbleSort(bubble, N);
        selectionSort(selection, N);

        print(bubble, N);
        System.out.println("Stable");

        print(selection, N);

        boolean stable = true;
        for (int i = 0; i < N; i++) {
            if (!bubble[i].equals(selection[i])) {
                stable = false;
                break;
            }
        }

        if (stable) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }

        sc.close();
    }
}
