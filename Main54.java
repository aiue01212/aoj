import java.util.Scanner;

public class Main54 {

    static boolean contains3(int x) {
        while (x > 0) {
            if (x % 10 == 3) {
                return true;
            }
            x /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            } else if (i % 10 == 3) {
                System.out.print(" " + i);
            } else if (contains3(i)) {
                System.out.print(" " + i);
            } else {
            }
        }

        System.out.println();
        scanner.close();
    }
}
