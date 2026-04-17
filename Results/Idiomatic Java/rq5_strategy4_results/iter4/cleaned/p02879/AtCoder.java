import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        int temp1 = 0;
        while (temp1 < inp.length() && !Character.isWhitespace(inp.charAt(temp1))) {
            temp1++;
        }
        if (temp1 == 0) {
            System.out.println("-1");
            return;
        }
        int a = Integer.parseInt(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && !Character.isWhitespace(inp.charAt(temp2))) {
            temp2++;
        }
        if (temp2 - temp1 == 0) {
            System.out.println("-1");
            return;
        }
        int b = Integer.parseInt(inp.substring(temp1, temp2));

        int c = a * b;

        if (a > 9 || b > 9) {
            System.out.println("-1");
        } else {
            System.out.printf("%010d%n", c);
        }
    }
}