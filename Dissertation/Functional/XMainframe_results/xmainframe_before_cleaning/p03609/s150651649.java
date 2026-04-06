import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = Integer.parseInt(inp.substring(0, inp.indexOf(" ")));
        int b = Integer.parseInt(inp.substring(inp.indexOf(" ") + 1));
        if (a >= b) {
            System.out.println(a - b);
        } else {
            System.out.println(0);
        }
    }
}