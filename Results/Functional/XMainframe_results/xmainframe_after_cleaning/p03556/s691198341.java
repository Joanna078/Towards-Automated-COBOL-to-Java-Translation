import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n = (int) Math.sqrt(n);
        n = n * n;
        String zs = Integer.toString(n);
        String ans = "";
        for (char c : zs.toCharArray()) {
            if (c != '0') {
                ans += c;
            }
        }
        System.out.println(ans);
    }
}
