import java.util.Scanner;

public class Main112 {

    static int[] dice(int x[]) {
        int[] d = new int[6];

        for (int i = 0; i < 6; i++) {
            d[i] = x[i];
        }

        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[6];

        for (int i = 0; i < 6; i++) {
            x[i] = scanner.nextInt();
        }

        int[] dice = dice(x);

        int q = scanner.nextInt();

        int sam1 = 0;
        int sam2 = 0;

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            for (int j = 0; j < 6; j++) {
                if (a == dice[j]) {
                    sam1 = j;
                    for (int k = 0; k < 6; k++) {
                        if (b == dice[k]) {
                            sam2 = k;
                            break;
                        }
                    }
                    break;
                }
            }

            if ((sam1 == 0 && sam2 == 1) || (sam1 == 1 && sam2 == 5) || (sam1 == 5 && sam2 == 4)
                    || (sam1 == 4 && sam2 == 0)) {
                System.out.println(dice[2]);
            } else if ((sam1 == 0 && sam2 == 4) || (sam1 == 4 && sam2 == 5) || (sam1 == 5 && sam2 == 1)
                    || (sam1 == 1 && sam2 == 0)) {
                System.out.println(dice[3]);
            } else if ((sam1 == 0 && sam2 == 3) || (sam1 == 3 && sam2 == 5) || (sam1 == 5 && sam2 == 2)
                    || (sam1 == 2 && sam2 == 0)) {
                System.out.println(dice[1]);
            } else if ((sam1 == 0 && sam2 == 2) || (sam1 == 2 && sam2 == 5) || (sam1 == 5 && sam2 == 3)
                    || (sam1 == 3 && sam2 == 0)) {
                System.out.println(dice[4]);
            } else if ((sam1 == 1 && sam2 == 2) || (sam1 == 2 && sam2 == 4) || (sam1 == 4 && sam2 == 3)
                    || (sam1 == 3 && sam2 == 1)) {
                System.out.println(dice[0]);
            } else if ((sam1 == 1 && sam2 == 3) || (sam1 == 3 && sam2 == 4) || (sam1 == 4 && sam2 == 2)
                    || (sam1 == 2 && sam2 == 1)) {
                System.out.println(dice[5]);
            } else {
            }
        }

        scanner.close();
    }
}