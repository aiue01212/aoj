import java.util.Scanner;

public class Main111 {

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

        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'N') {
                int temp = dice[0];
                dice[0] = dice[1];
                dice[1] = dice[5];
                dice[5] = dice[4];
                dice[4] = temp;
            } else if (c == 'S') {
                int temp = dice[0];
                dice[0] = dice[4];
                dice[4] = dice[5];
                dice[5] = dice[1];
                dice[1] = temp;
            } else if (c == 'E') {
                int temp = dice[0];
                dice[0] = dice[3];
                dice[3] = dice[5];
                dice[5] = dice[2];
                dice[2] = temp;
            } else if (c == 'W') {
                int temp = dice[0];
                dice[0] = dice[2];
                dice[2] = dice[5];
                dice[5] = dice[3];
                dice[3] = temp;
            }
        }

        System.out.println(dice[0]);
        scanner.close();
    }
}
