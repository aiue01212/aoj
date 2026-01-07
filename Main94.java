import java.util.Scanner;

public class Main94 {

    static void print(int a, int b, String str) {

        String[] S = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            S[i] = String.valueOf(c);
        }

        for (int i = a; i <= b; i++) {
            System.out.print(S[i]);
        }
        System.out.println();
    }

    static String[] reverse(int a, int b, String str) {

        String[] S = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            S[i] = String.valueOf(c);
        }

        for (int i = a, j = b; i < j; i++, j--) {
            String temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }

        return S;
    }

    static String[] replace(int a, int b, String str, String d) {

        String[] S = new String[str.length()];
        String[] O = new String[d.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            S[i] = String.valueOf(c);
        }

        for (int i = 0; i < d.length(); i++) {
            char c = d.charAt(i);
            O[i] = String.valueOf(c);
        }

        for (int i = a; i <= b; i++) {
            S[i] = O[i - a];
        }

        return S;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            String t = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (t.equals("print")) {
                print(a, b, str);
            } else if (t.equals("reverse")) {
                String[] S = reverse(a, b, str);
                StringBuilder sb = new StringBuilder();
                for (String s : S) {
                    sb.append(s);
                }
                str = sb.toString();
            } else if (t.equals("replace")) {
                String d = scanner.next();
                String[] S = replace(a, b, str, d);
                StringBuilder sb = new StringBuilder();
                for (String s : S) {
                    sb.append(s);
                }
                str = sb.toString();
            }
        }

        scanner.close();
    }
}
