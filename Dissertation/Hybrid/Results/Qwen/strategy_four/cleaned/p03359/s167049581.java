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

        // Subtract 1 from i to get the correct index for substring
        a = Integer.parseInt(inp.substring(0, i));
        i += 2; // Move index forward by 2 to start of next number

        // Check if i is within bounds before accessing substring
        if (i + 1 < inp.length()) { // Corrected condition to check for two digits
            b = Integer.parseInt(inp.substring(i, i + 2)); // Corrected substring length to 2
        } else {
            // Handle case where there are not enough characters for b
            b = 0; // or some other appropriate default value
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