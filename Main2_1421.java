import java.io.*;

public class Main2_1421 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String T = br.readLine();
        String P = br.readLine();

        int[] lps = makeLPS(P);
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;

        while (i < T.length()) {
            if (T.charAt(i) == P.charAt(j)) {
                i++;
                j++;

                if (j == P.length()) {
                    sb.append(i - j).append('\n');
                    j = lps[j - 1];
                }
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        System.out.print(sb.toString());
    }

    static int[] makeLPS(String p) {
        int[] lps = new int[p.length()];
        int len = 0;
        int i = 1;

        while (i < p.length()) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}