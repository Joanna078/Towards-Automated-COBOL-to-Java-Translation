import java.util.Scanner;

public class ABC_058_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input strings O and E
        System.out.print("Enter string O: ");
        String O = scanner.nextLine();
        System.out.print("Enter string E: ");
        String E = scanner.nextLine();

        // Calculate the length of O
        int len = O.length();

        // Initialize the result string
        StringBuilder ans = new StringBuilder();

        // Perform the string manipulation
        for (int i = 0; i < len; i++) {
            ans.append(O.charAt(i)).append(E.charAt(i));
        }

        // Display the result
        System.out.println("Result: " + ans.toString());

        scanner.close();
    }
}