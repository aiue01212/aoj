import java.util.Scanner;

public class Main92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String yama = scanner.next();

            String[] a = new String[yama.length()];

            if (yama.equals("-")) {
                break;
            }

            int m = scanner.nextInt();

            for (int i = 0; i < yama.length(); i++) {
                char c = yama.charAt(i);
                a[i] = String.valueOf(c);
            }

            for (int i = 0; i < m; i++) {
                int h = scanner.nextInt();
                for (int j = 0; j < h; j++) {
                    String temp = a[0];
                    for (int k = 0; k < a.length - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    a[a.length - 1] = temp;
                }
            }

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
