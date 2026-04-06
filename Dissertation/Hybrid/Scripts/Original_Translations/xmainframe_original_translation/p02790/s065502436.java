import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int n;
        if (a <= b) {
            n = b;
        } else {
            n = a;
            a = b;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            out.append(a);
        }
        System.out.println(out.toString());
    }
}
