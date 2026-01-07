import java.util.Scanner;

public class Main2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        System.out.println(x);

        sc.close();
    }
}
