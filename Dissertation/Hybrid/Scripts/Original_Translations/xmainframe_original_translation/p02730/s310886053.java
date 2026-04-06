import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int m = n;
        StringBuilder sb = new StringBuilder(s);
        String reversedStr = sb.reverse().toString();
        if (s.equals(reversedStr)) {
            m /= 2;
            String x = s.substring(0, m);
            sb = new StringBuilder(x);
            String reversedX = sb.reverse().toString();
            if (x.equals(reversedX)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
