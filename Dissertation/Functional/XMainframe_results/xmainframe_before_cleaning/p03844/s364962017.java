import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a = Integer.parseInt(inp.split(" ")[0]);
        char op = inp.charAt(inp.indexOf(op));
        int b = Integer.parseInt(inp.split(" ")[2]);
        int ans;
        if (op == '+') {
            ans = a + b;
        } else {
            ans = a - b;
        }
        System.out.println(ans);
    }
}