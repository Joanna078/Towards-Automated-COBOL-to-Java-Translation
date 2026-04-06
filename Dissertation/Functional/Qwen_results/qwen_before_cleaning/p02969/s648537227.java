public class AtCoder {
    public static void main(String[] args) {
        // Input variable
        int A;

        // Read input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for A:");
        A = scanner.nextInt();
        scanner.close();

        // Compute A = 3 * A * A
        A = 3 * A * A;

        // Output the result
        System.out.println(A);
    }
}