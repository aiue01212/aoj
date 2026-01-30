import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main2_1522 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long W = Long.parseLong(st.nextToken());

        long[] v = new long[N];
        long[] w = new long[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            v[i] = Long.parseLong(st.nextToken());
            w[i] = Long.parseLong(st.nextToken());
        }

        Integer[] in = new Integer[N];
        for (int i = 0; i < N; i++) {
            in[i] = i;
        }

        Arrays.sort(in, (i, j) -> {
            BigInteger lhs = BigInteger.valueOf(v[i]).multiply(BigInteger.valueOf(w[j]));
            BigInteger rhs = BigInteger.valueOf(v[j]).multiply(BigInteger.valueOf(w[i]));
            return rhs.compareTo(lhs);
        });

        double r = W;
        double answer = 0.0;

        for (int k = 0; k < N && r > 0; k++) {
            int i = in[k];
            if (w[i] <= r) {
                answer += v[i];
                r -= w[i];
            } else {
                answer += (double) v[i] / w[i] * r;
                break;
            }
        }

        System.out.printf("%.10f%n", answer);
    }
}
