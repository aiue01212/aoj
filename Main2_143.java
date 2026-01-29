import java.util.Scanner;

public class Main2_143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        char[][] field = new char[H][W];
        for (int i = 0; i < H; i++) {
            field[i] = sc.nextLine().toCharArray();
        }

        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();

        char[][] pattern = new char[R][C];
        for (int i = 0; i < R; i++) {
            pattern[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i <= H - R; i++) {
            for (int j = 0; j <= W - C; j++) {
                boolean match = true;
                for (int r = 0; r < R; r++) {
                    for (int c = 0; c < C; c++) {
                        if (field[i + r][j + c] != pattern[r][c]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match)
                        break;
                }
                if (match) {
                    System.out.println(i + " " + j);
                }
            }
        }

        sc.close();
    }
}
