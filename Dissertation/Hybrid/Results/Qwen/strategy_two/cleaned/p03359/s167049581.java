import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = 0;
        int b = 0;
        int d = 0;
        int i = 0;

        while (i < inp.length() && inp.charAt(i) != ' ') {
            i++;
        }

        a = Integer.parseInt(inp.substring(0, i));
        i += 2; // Ensure there is at least one space after the first number
        if (i < inp.length()) { // Check if there are enough characters for the second number
            b = Integer.parseInt(inp.substring(i, i + 2));
        } else {
            System.out.println("Invalid input");
            return;
        }

        if (a > b) {
            a--;
        }

        if (a < 10) {
            d = a;
            System.out.println(d);
        } else {
            System.out.println(a);
        }
    }
}