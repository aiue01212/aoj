import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2_53 {

    static void koch(int n,
            double x1, double y1,
            double x2, double y2) {

        if (n == 0)
            return;

        double sx = (2.0 * x1 + x2) / 3.0;
        double sy = (2.0 * y1 + y2) / 3.0;

        double tx = (x1 + 2.0 * x2) / 3.0;
        double ty = (y1 + 2.0 * y2) / 3.0;

        double ux = (sx + tx) / 2.0 - (ty - sy) * Math.sqrt(3.0) / 2.0;
        double uy = (sy + ty) / 2.0 + (tx - sx) * Math.sqrt(3.0) / 2.0;

        koch(n - 1, x1, y1, sx, sy);
        print(sx, sy);

        koch(n - 1, sx, sy, ux, uy);
        print(ux, uy);

        koch(n - 1, ux, uy, tx, ty);
        print(tx, ty);

        koch(n - 1, tx, ty, x2, y2);
    }

    static void print(double x, double y) {
        System.out.printf("%.8f %.8f%n", x, y);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        print(0.0, 0.0);

        koch(n, 0.0, 0.0, 100.0, 0.0);

        print(100.0, 0.0);
    }
}
