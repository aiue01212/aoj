import java.util.Scanner;

public class Main102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double si = scanner.nextDouble();

        double rad = Math.toRadians(si);

        double S = x * y * Math.sin(rad) * 1.0 / 2.0;
        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) - 2 * x * y * Math.cos(rad));
        double L = x + y + z;
        double h = (2 * S) / x;

        System.out.printf("%.8f\n", S);
        System.out.printf("%.8f\n", L);
        System.out.printf("%.8f\n", h);

        scanner.close();
    }
}
