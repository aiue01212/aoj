import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main2_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        Queue<String> queue = new ArrayDeque<>();
        String[] name = new String[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            time[i] = sc.nextInt();
            queue.add(name[i] + " " + time[i]);
        }

        int result = 0;

        while (!queue.isEmpty()) {
            String[] parts = queue.poll().split(" ");
            String na = parts[0];
            int t = Integer.parseInt(parts[1]);

            if (t <= q) {
                result += t;
                System.out.println(na + " " + result);
            } else {
                result += q;
                t -= q;
                queue.add(na + " " + t);
            }
        }

        sc.close();
    }
}
