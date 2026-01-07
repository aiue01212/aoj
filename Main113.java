import java.util.Scanner;

public class Main113 {

    static int[] dice(int x[]) {
        int[] d = new int[6];

        for (int i = 0; i < 6; i++) {
            d[i] = x[i];
        }

        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[6];
        int[] y = new int[6];

        for (int i = 0; i < 6; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            y[i] = scanner.nextInt();
        }

        int[] dice1 = dice(x);
        int[] dice2 = dice(y);

        int result = 0;

        for (int i = 0; i < 6; i++) {
            if (dice1[0] == dice2[i] && dice1[5] == dice2[(5 - i)]) {
                for (int j = 0; j < 6; j++) {
                    if (dice1[1] == dice2[(j)] && dice1[4] == dice2[(5 - j)]) {
                        for (int k = 0; k < 6; k++) {
                            if (dice1[2] == dice2[k] && dice1[3] == dice2[(5 - k)]) {
                                if (k == 1 || k == 4) {
                                    if ((i < j && j < (5 - j) && (5 - j) < (5 - i)) ||
                                            (i > j && j > (5 - j) && (5 - j) > (5 - i)) ||
                                            (j < (5 - i) && (5 - i) < i && i < (5 - j)) ||
                                            (j > (5 - i) && (5 - i) > i && i > (5 - j))) {
                                        if (k > 5 - k) {
                                            result++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else if ((i < (5 - j) && (5 - j) < j && j < (5 - i)) ||
                                            (i > (5 - j) && (5 - j) > j && j > (5 - i)) ||
                                            ((5 - j) < (5 - i) && (5 - i) < i && i < j) ||
                                            ((5 - j) > (5 - i) && (5 - i) > i && i > j)) {
                                        if (k < 5 - k) {
                                            result++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    if ((i < j && j < (5 - j) && (5 - j) < (5 - i)) ||
                                            (i > j && j > (5 - j) && (5 - j) > (5 - i)) ||
                                            (j < (5 - i) && (5 - i) < i && i < (5 - j)) ||
                                            (j > (5 - i) && (5 - i) > i && i > (5 - j))) {
                                        if (k < 5 - k) {
                                            result++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    }

                                    else if ((i < (5 - j) && (5 - j) < j && j < (5 - i)) ||
                                            (i > (5 - j) && (5 - j) > j && j > (5 - i)) ||
                                            ((5 - j) < (5 - i) && (5 - i) < i && i < j) ||
                                            ((5 - j) > (5 - i) && (5 - i) > i && i > j)) {
                                        if (k > 5 - k) {
                                            result++;
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
