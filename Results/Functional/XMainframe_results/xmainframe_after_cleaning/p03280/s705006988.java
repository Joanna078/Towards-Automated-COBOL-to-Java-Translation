import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int tmp = a * b - (a + b - 1);
        String zs = String.format("%d", tmp);
        String ans = "";
        for (char c : zs.toCharArray()) {
            if (c != '0') {
                ans += c;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
