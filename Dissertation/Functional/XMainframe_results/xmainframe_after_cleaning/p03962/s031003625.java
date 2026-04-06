import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = Integer.parseInt(inp.substring(0, inp.indexOf(" ")));
        int b = Integer.parseInt(inp.substring(inp.indexOf(" ") + 1, inp.lastIndexOf(" ")));
        int c = Integer.parseInt(inp.substring(inp.lastIndexOf(" ") + 1));
        if (a == b && b != c) {
            System.out.println(2);
        } else if (a != b && b == c) {
            System.out.println(2);
        } else if (a == c && b != c) {
            System.out.println(2);
        } else if (a == c && b == c) {
            System.out.println(1);
        } else {
            System.out.println(3);
        }
    }
}
