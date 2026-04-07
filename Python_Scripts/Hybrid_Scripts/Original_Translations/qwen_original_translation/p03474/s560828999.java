import java.util.Scanner;

public class ABC_084_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        String inp = scanner.nextLine();
        String s = scanner.nextLine();

        // Parsing input
        int a = Character.getNumericValue(inp.charAt(0));
        int b = Character.getNumericValue(inp.charAt(1));

        // Flag variable
        boolean flag = true;

        // Loop through the string s
        for (int i = 1; i <= a + b + 1; i++) {
            if (a + 1 == i && !s.substring(i - 1, i).equals("-")) {
                flag = false;
                break;
            } else if (a + 1 != i && s.substring(i - 1, i).equals("-")) {
                flag = false;
                break;
            }
        }

        // Output result
        System.out.println(flag ? "Yes" : "No");

        scanner.close();
    }
}