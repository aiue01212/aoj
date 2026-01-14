import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> dict = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            String str = sc.next();

            if (command.equals("insert")) {
                dict.add(str);
            } else if (command.equals("find")) {
                if (dict.contains(str)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}