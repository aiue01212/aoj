import java.io.*;
import java.util.*;

public class Main2_143 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        char[][] field = new char[H][];
        for (int i = 0; i < H; i++) {
            field[i] = br.readLine().toCharArray();
        }

        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] pattern = new char[R][];
        for (int i = 0; i < R; i++) {
            pattern[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i <= H - R; i++) {
            for (int j = 0; j <= W - C; j++) {

                boolean match = true;

                for (int r = 0; r < R && match; r++) {
                    for (int c = 0; c < C; c++) {
                        if (field[i + r][j + c] != pattern[r][c]) {
                            match = false;
                            break;
                        }
                    }
                }

                if (match) {
                    sb.append(i).append(' ').append(j).append('\n');
                }
            }
        }

        System.out.print(sb.toString());
    }
}