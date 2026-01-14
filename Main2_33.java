import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.ArrayDeque;

public class Main2_33 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "insert":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "delete":
                    int x = Integer.parseInt(st.nextToken());
                    Iterator<Integer> it = deque.iterator();
                    while (it.hasNext()) {
                        if (it.next() == x) {
                            it.remove();
                            break;
                        }
                    }
                    break;

                case "deleteFirst":
                    if (!deque.isEmpty())
                        deque.pollFirst();
                    break;

                case "deleteLast":
                    if (!deque.isEmpty())
                        deque.pollLast();
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int v : deque) {
            if (!first)
                sb.append(' ');
            sb.append(v);
            first = false;
        }
        System.out.println(sb.toString());
    }
}
