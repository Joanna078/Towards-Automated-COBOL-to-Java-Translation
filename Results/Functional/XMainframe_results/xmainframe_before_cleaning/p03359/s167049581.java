import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = Integer.parseInt(inp.substring(0, inp.indexOf(' ')));
        int b = Integer.parseInt(inp.substring(inp.lastIndexOf(' ') + 1));
        if (a > b) {
            a = a - 1;
        }
        if (a < 10) {
            System.out.println(a);
        } else {
            System.out.println(Integer.toString(a));
        }
    }
}