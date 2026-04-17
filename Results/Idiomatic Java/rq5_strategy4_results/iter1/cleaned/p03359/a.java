import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        int i = 0;
        while (i < inp.length() && !Character.isWhitespace(inp.charAt(i))) {
            i++;
        }
        i--;

        String aStr = inp.substring(0, i);
        int a = Integer.parseInt(aStr);

        String bStr = inp.substring(i + 2, i + 4);
        int b = Integer.parseInt(bStr);

        if (a > b) {
            a--;
        }

        int d = a < 10 ? a : a;
        System.out.println(d);
    }
}