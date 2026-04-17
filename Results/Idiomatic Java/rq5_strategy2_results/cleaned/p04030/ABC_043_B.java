import java.util.Scanner;

public class ABC_043_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = scanner.nextLine();
        scanner.close();

        char[] s = s1.toCharArray();
        char[] ans = new char[10];
        int now = 0;

        for (char c : s) {
            if (c == 'B') {
                if (now != 0) {
                    ans[now - 1] = ' ';
                    now--;
                }
            } else {
                if (now < 10) {
                    ans[now] = c;
                    now++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < now; i++) {
            result.append(ans[i]);
        }

        System.out.println(result.toString());
    }
}