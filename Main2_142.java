import java.util.*;

public class Main2_142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();
        String P = sc.nextLine();

        int start = 0;

        while (true) {
            int i = T.indexOf(P, start);
            if (i == -1) {
                break;
            }
            System.out.println(i);
            start = i + 1;
        }

        sc.close();
    }
}