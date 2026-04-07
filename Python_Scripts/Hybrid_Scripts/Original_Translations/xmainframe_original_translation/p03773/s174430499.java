import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int sum = b + a;
        if (sum >= 24) {
            sum -= 24;
        }
        System.out.println(String.format("%02d", sum));
    }
}
