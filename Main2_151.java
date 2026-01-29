import java.util.Scanner;

public class Main2_151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int[] coins = { 25, 10, 5, 1 };

        for (int coin : coins) {
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);

        sc.close();
    }
}
