public class ABC_068_A {
    public static void main(String[] args) {
        // Declare variables
        String n;
        StringBuilder ans = new StringBuilder();

        // Read input from user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter value for N: ");
        n = scanner.nextLine();
        scanner.close();

        // Display output
        System.out.println("ABC" + n);
    }
}