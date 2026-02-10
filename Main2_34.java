import java.util.*;

public class Main2_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Integer> down = new Stack<>();
        Stack<int[]> ponds = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '\\') {
                down.push(i);
            } else if (c == '/') {
                if (!down.isEmpty()) {
                    int start = down.pop();
                    int area = i - start;

                    while (!ponds.isEmpty() && ponds.peek()[0] > start) {
                        area += ponds.pop()[1];
                    }
                    ponds.push(new int[] { start, area });
                }
            }
        }

        int total = 0;
        for (int[] p : ponds) {
            total += p[1];
        }

        System.out.println(total);
        System.out.print(ponds.size());

        for (int[] p : ponds) {
            System.out.print(" " + p[1]);
        }

        System.out.println();
        sc.close();
    }
}