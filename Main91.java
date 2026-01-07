import java.util.Scanner;

public class Main91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String W = sc.next();

        int count = 0;

        while (sc.hasNext()) {
            String T = sc.next().toLowerCase();
            if (T.equals(W)) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}