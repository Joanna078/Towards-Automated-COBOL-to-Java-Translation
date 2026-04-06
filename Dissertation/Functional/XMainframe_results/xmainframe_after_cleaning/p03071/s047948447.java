import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int out;
        if (a == b) {
            out = a * 2;
        } else if (a > b) {
            out = a * 2 - 1;
        } else {
            out = b * 2 - 1;
        }
        System.out.println(String.format("%d", out));
    }
}
