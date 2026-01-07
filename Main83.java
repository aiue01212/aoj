import java.util.Scanner;

public class Main83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[26];

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    }

                    int index = c - 'a';
                    a[index]++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter + " : " + a[i]);
        }

        scanner.close();
    }
}
