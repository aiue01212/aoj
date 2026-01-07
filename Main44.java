import java.util.Scanner;
import java.util.Arrays;

public class Main44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        long result = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            result += a[i];
        }

        Arrays.sort(a);

        System.out.println(a[0] + " " + a[n - 1] + " " + result);

        sc.close();
    }
}
