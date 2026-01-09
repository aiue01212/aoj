import java.util.Arrays;
import java.util.Scanner;

public class Main2_42 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }

        Arrays.sort(S);

        int q = sc.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < q; i++) {
            if (binarySearch(S, T[i])) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    private static boolean binarySearch(int[] S, int key) {
        int left = 0;
        int right = S.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (S[mid] == key) {
                return true;
            } else if (S[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}