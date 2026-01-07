import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double s = r * r * 3.141592653589793;
        double l = 2 * r * 3.141592653589793;

        System.out.printf("%.5f %.5f%n", s, l);

        sc.close();
    }
}