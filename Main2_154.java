import java.io.*;
import java.util.*;

public class Main2_154 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        if (S.length() == 1) {
            System.out.println(1);
            return;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : S.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int f : freq.values()) {
            pq.add((long) f);
        }

        long totalCost = 0;

        while (pq.size() > 1) {
            long a = pq.poll();
            long b = pq.poll();

            long sum = a + b;
            totalCost += sum;

            pq.add(sum);
        }

        System.out.println(totalCost);
    }
}