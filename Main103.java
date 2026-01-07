import java.util.Scanner;

public class Main103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            double sum1 = 0;
            double std = 0;

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            double ave = (double) sum / n;

            for (int i = 0; i < n; i++) {
                sum1 += Math.pow(a[i] - ave, 2);
                std = Math.sqrt(sum1 / n);
            }

            System.out.printf("%.8f\n", std);
        }

        sc.close();
    }
}
