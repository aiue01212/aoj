import java.util.Scanner;

public class Main2_63 {

    static char[] suit;
    static int[] value;
    static int[] index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        suit = new char[n];
        value = new int[n];
        index = new int[n];

        for (int i = 0; i < n; i++) {
            suit[i] = sc.next().charAt(0);
            value[i] = sc.nextInt();
            index[i] = i;
        }

        quickSort(0, n - 1);

        if (isStable(n)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }

        for (int i = 0; i < n; i++) {
            System.out.println(suit[i] + " " + value[i]);
        }

        sc.close();
    }

    static void quickSort(int p, int r) {
        if (p < r) {
            int q = partition(p, r);
            quickSort(p, q - 1);
            quickSort(q + 1, r);
        }
    }

    static int partition(int p, int r) {
        int x = value[r];
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (value[j] <= x) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, r);

        return i + 1;
    }

    static void swap(int i, int j) {
        char ts = suit[i];
        suit[i] = suit[j];
        suit[j] = ts;

        int tv = value[i];
        value[i] = value[j];
        value[j] = tv;

        int ti = index[i];
        index[i] = index[j];
        index[j] = ti;
    }

    static boolean isStable(int n) {
        for (int i = 1; i < n; i++) {
            if (value[i - 1] == value[i]) {
                if (index[i - 1] > index[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}