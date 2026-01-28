import java.util.*;

public class Main2_141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();
        String P = sc.nextLine();

        int n = T.length();
        int m = P.length();

        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (T.charAt(i + j) != P.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
