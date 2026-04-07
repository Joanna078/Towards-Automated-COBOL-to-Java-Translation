import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder out = new StringBuilder();
        while (n > 0) {
            int m = n - 1;
            int amr = m % 26;
            char c = alpha.charAt(amr);
            out.append(c);
            m /= 26;
            n = m + 1;
        }
        System.out.println(out.reverse().toString());
    }
}