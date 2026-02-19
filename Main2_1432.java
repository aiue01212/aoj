import java.io.*;
import java.util.*;

public class Main2_1432 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        String[] field = new String[H];
        for (int i = 0; i < H; i++) {
            field[i] = br.readLine();
        }

        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[] pattern = new String[R];
        for (int i = 0; i < R; i++) {
            pattern[i] = br.readLine();
        }

        for (int i = 0; i <= H - R; i++) {

            int idx = 0;
            while (idx <= W - C) {

                idx = field[i].indexOf(pattern[0], idx);
                if (idx == -1)
                    break;

                boolean match = true;

                for (int r = 1; r < R; r++) {
                    if (!field[i + r].startsWith(pattern[r], idx)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    sb.append(i).append(" ").append(idx).append("\n");
                }

                idx++;
            }
        }

        System.out.print(sb.toString());
    }
}