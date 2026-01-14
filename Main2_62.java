import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2_62 {

    static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int q = partition(A, 0, n - 1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i > 0)
                sb.append(' ');
            if (i == q) {
                sb.append('[').append(A[i]).append(']');
            } else {
                sb.append(A[i]);
            }
        }
        sb.append('\n');

        System.out.print(sb.toString());
    }
}
