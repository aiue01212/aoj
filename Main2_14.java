import java.util.Scanner;

public class Main2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();

            result = x - min;

            if (result > max) {
                max = result;
            }

            if (x < min) {
                min = x;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
