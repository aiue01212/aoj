import java.util.Scanner;

public class Main82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            int sum = 0;

            if (input.equals("0")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int num = Character.getNumericValue(c);
                sum += num;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}