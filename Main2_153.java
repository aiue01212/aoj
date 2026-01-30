import java.io.*;
import java.util.*;

public class Main2_153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] s = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s[i] = Integer.parseInt(st.nextToken());
            t[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] in = new Integer[n];
        for (int i = 0; i < n; i++) {
            in[i] = i;
        }

        Arrays.sort(in, (i, j) -> Integer.compare(t[i], t[j]));

        int count = 0;
        int last = -1;

        for (int k = 0; k < n; k++) {
            int i = in[k];
            if (s[i] > last) {
                count++;
                last = t[i];
            }
        }

        System.out.println(count);
    }
}
