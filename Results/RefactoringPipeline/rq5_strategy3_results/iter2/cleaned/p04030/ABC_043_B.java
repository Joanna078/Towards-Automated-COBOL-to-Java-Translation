import java.util.Scanner;

public class ABC_043_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] s1 = input.toCharArray();
        char[] ans1 = new char[10];
        int now = 0;

        for (char c : s1) {
            if (c == 'B') {
                if (now != 0) {
                    ans1[--now] = ' ';
                }
            } else {
                if (now < 10) {
                    ans1[now++] = c;
                }
            }
        }

        System.out.print(new String(ans1, 0, now));
    }
}