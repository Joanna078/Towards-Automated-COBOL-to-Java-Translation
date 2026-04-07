import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = 0, b = 0, c = 0;
        int temp1 = 0, temp2 = 0, n = 0;

        // Find the first space
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        if (temp1 > 0) {
            a = Integer.parseInt(inp.substring(0, temp1));
        }

        // Skip the first space and find the next space
        temp1++;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        if (temp1 > 0) {
            temp2 = temp1 + 1;
            n = temp2 - temp1;
            b = Integer.parseInt(inp.substring(temp1, temp2));
        }

        // Skip the second space and find the end of the string
        temp2++;
        n = inp.length() - temp2;
        c = Integer.parseInt(inp.substring(temp2));

        // Determine the output based on the conditions
        if ((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) {
            System.out.println(2);
        } else if (a == b && b == c) {
            System.out.println(1);
        } else {
            System.out.println(3);
        }
    }
}