import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int h = a / 3600;
        int m = (a % 3600) / 60;
        int s = a % 60;

        System.out.println(h + ":" + m + ":" + s);

        scanner.close();
    }
}
