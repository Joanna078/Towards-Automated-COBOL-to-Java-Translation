import java.util.Scanner;

public class ProgramID {

    private static String S;
    private static String X;
    private static String cur;
    private static int n;
    private static int m;
    private static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
        scanner.close();

        n = S.length();
        m = n;
        reverseString();
        
        if (S.equals(cur)) {
            cur = "";
            m /= 2;
            X = S.substring(0, m);
            reverseString();
            if (X.equals(cur)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }

    private static void reverseString() {
        cur = "";
        for (i = 0; i < m; i++) {
            cur += S.charAt(m - i - 1);
        }
    }
}