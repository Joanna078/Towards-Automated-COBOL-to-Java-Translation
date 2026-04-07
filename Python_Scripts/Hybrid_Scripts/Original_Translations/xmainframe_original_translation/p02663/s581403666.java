import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int h1 = Integer.parseInt(inp.split(" ")[0]);
        int m1 = Integer.parseInt(inp.split(" ")[1]);
        int h2 = Integer.parseInt(inp.split(" ")[2]);
        int m2 = Integer.parseInt(inp.split(" ")[3]);
        int k = Integer.parseInt(inp.split(" ")[4]);
        int w;
        int out;
        w = h2 * 60 + m2 - (h1 * 60 + m1);
        out = w - k;
        System.out.println(String.format("%04d", out));
    }
}
