import java.util.*;

public class Main2_131 {

    static final int N = 8;
    static boolean[][] board = new boolean[N][N];
    static boolean[] row = new boolean[N];
    static boolean[] diag1 = new boolean[2 * N];
    static boolean[] diag2 = new boolean[2 * N];

    static boolean solved = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            board[l][r] = true;
            row[r] = true;
            diag1[l + r] = true;
            diag2[l - r + N] = true;
        }

        dfs(0);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] ? 'Q' : '.');
            }
            System.out.println();
        }
        sc.close();
    }

    static void dfs(int line) {
        if (line == N) {
            solved = true;
            return;
        }

        for (int j = 0; j < N; j++) {
            if (board[line][j]) {
                dfs(line + 1);
                return;
            }
        }

        for (int c = 0; c < N; c++) {
            if (row[c] || diag1[line + c] || diag2[line - c + N])
                continue;

            board[line][c] = true;
            row[c] = diag1[line + c] = diag2[line - c + N] = true;

            dfs(line + 1);
            if (solved)
                return;

            board[line][c] = false;
            row[c] = diag1[line + c] = diag2[line - c + N] = false;
        }
    }
}
