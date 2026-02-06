import java.io.*;

public class Main2_144 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String T = br.readLine();
        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            String P = br.readLine().trim();

            if (T.indexOf(P) != -1) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}