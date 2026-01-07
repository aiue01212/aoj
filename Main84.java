import java.util.Scanner;

public class Main84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String ansinput = scanner.nextLine();
        int result = 0;
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ansinput.charAt(0)) {
                result++;
                for (int j = 1; j < ansinput.length(); j++) {
                    int k = i + j;
                    if (k > input.length() - 1) {
                        k = k - input.length();
                    }

                    if (input.charAt(k) != ansinput.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }
        }

        if (result == count) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
