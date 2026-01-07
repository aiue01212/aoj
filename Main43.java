import java.util.Scanner;

public class Main43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            if (op.equals("?")) {
                break;
            }

            int result = 0;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            System.out.println(result);
        }

        sc.close();
    }
}
