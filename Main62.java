import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] has = new boolean[4][14];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int r = sc.nextInt();

            int suit = suitIndex(s);
            has[suit][r] = true;
        }

        String[] suits = { "S", "H", "C", "D" };

        for (int s = 0; s < 4; s++) {
            for (int r = 1; r <= 13; r++) {
                if (!has[s][r]) {
                    System.out.println(suits[s] + " " + r);
                }
            }
        }

        sc.close();
    }

    static int suitIndex(String s) {
        if (s.equals("S"))
            return 0;
        if (s.equals("H"))
            return 1;
        if (s.equals("C"))
            return 2;
        return 3;
    }
}