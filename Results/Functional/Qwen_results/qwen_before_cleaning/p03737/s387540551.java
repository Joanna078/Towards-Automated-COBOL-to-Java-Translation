import java.util.Scanner;

public class ABC_059_A {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of 32 characters separated by spaces:");
        String inp = scanner.nextLine();
        scanner.close();

        // Splitting the input into three parts
        String[] parts = inp.split("\\s+", 3);

        // Ensure there are exactly three parts
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three parts separated by spaces.");
        }

        // Convert each part to uppercase
        String s1 = parts[0].toUpperCase();
        String s2 = parts[1].toUpperCase();
        String s3 = parts[2].toUpperCase();

        // Display the first character of each part
        System.out.println(s1.charAt(0) + " " + s2.charAt(0) + " " + s3.charAt(0));
    }
}