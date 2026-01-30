import java.util.*;

public class Main2_1421 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();
        String P = sc.nextLine();

        int n = T.length();
        int m = P.length();

        for (int i = 0; i <= n - m; i++) {
            if (T.substring(i, i + m).equals(P)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}