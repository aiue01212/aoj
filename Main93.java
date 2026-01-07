import java.util.Scanner;

public class Main93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ts = 0;
        int hs = 0;

        for (int i = 0; i < n; i++) {
            String t = scanner.next();
            String h = scanner.next();

            int result = t.compareTo(h);

            if (result > 0) {
                ts = ts + 3;
            } else if (result < 0) {
                hs = hs + 3;
            } else {
                ts = ts + 1;
                hs = hs + 1;
            }
        }

        System.out.println(ts + " " + hs);

        scanner.close();
    }
}
