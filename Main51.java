import java.util.Scanner;

public class Main51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            if (H == 0 && W == 0) {
                break;
            }

            for (int i = 0; i < H; i++) {

                if (i == 0 || i == H - 1) {
                    for (int j = 0; j < W; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                    continue;
                } else {
                    System.out.print("#");
                    for (int j = 0; j < W - 2; j++) {
                        System.out.print(".");
                    }
                    System.out.println("#");
                    continue;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
