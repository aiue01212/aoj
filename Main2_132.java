import java.util.*;

public class Main2_132 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            sb.append(sc.nextInt());
        }

        sc.close();

        String start = sb.toString();
        String goal = "123456780";

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        int step = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int s = 0; s < size; s++) {

                String current = queue.poll();

                if (current.equals(goal)) {
                    System.out.println(step);
                    return;
                }

                int zero = current.indexOf('0');
                int x = zero / 3;
                int y = zero % 3;

                for (int i = 0; i < 4; i++) {

                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {

                        int nextPos = nx * 3 + ny;

                        char[] arr = current.toCharArray();
                        char tmp = arr[zero];
                        arr[zero] = arr[nextPos];
                        arr[nextPos] = tmp;

                        String next = new String(arr);

                        if (!visited.contains(next)) {
                            visited.add(next);
                            queue.add(next);
                        }
                    }
                }
            }
            step++;
        }
    }
}
