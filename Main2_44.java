import java.io.*;
import java.util.*;

public class Main2_44 {

    static int n, k;
    static int[] w;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        w = new int[n];
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(br.readLine());
            left = Math.max(left, w[i]);
            right += w[i];
        }

        int ans = right;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canNumber(mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }

    static boolean canNumber(int capacity) {
        int trucks = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + w[i] <= capacity) {
                sum += w[i];
            } else {
                trucks++;
                sum = w[i];
            }
        }

        return trucks <= k;
    }
}
