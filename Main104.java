import java.util.Scanner;

public class Main104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        double man = 0;
        double sum = 0;
        double sum1 = 0;
        double yu = 0;
        double san = 0;
        double max = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            man += Math.abs(x[i] - y[i]);
            sum += Math.pow(Math.abs(x[i] - y[i]), 2);
            sum1 += Math.pow(Math.abs(x[i] - y[i]), 3);
            max = Math.max(max, Math.abs(x[i] - y[i]));
        }

        yu = Math.sqrt(sum);
        san = Math.cbrt(sum1);

        System.out.printf("%.8f\n", man);
        System.out.printf("%.8f\n", yu);
        System.out.printf("%.8f\n", san);
        System.out.printf("%.8f\n", max);

        sc.close();
    }
}
