import java.util.Scanner;
import java.util.ArrayList;

public class Main2_24 {

    static long cnt = 0;

    static void insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j + g] = v;
        }
    }

    static void shellSort(int[] A, int n) {
        ArrayList<Integer> G = new ArrayList<>();

        int g = 1;
        while (g <= n) {
            G.add(g);
            g = 3 * g + 1;
        }

        for (int i = G.size() - 1; i >= 0; i--) {
            insertionSort(A, n, G.get(i));
        }

        System.out.println(G.size());

        for (int i = G.size() - 1; i >= 0; i--) {
            System.out.print(G.get(i));
            if (i != 0)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        shellSort(A, n);
        System.out.println(cnt);

        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }

        sc.close();
    }
}
