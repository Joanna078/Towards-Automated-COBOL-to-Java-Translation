public class ABC_073_A {
    public static void main(String[] args) {
        // Read input from user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        // Check if either character is '9'
        boolean result = inp.charAt(0) == '9' || (inp.length() > 1 && inp.charAt(1) == '9');

        // Display the result
        System.out.println(result ? "Yes" : "No");
    }
}