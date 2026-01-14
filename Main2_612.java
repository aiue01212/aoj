import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2_612 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (A[i] > max)
                max = A[i];
        }

        int[] B = new int[n];
        int[] C = new int[max + 1];

        for (int j = 0; j < n; j++) {
            C[A[j]]++;
        }

        for (int i = 1; i <= max; i++) {
            C[i] += C[i - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]]--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0)
                sb.append(' ');
            sb.append(B[i]);
        }
        sb.append('\n');

        System.out.print(sb.toString());
    }
}
