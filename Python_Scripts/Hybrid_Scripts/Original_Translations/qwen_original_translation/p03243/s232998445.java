public class ABC111B {
    public static void main(String[] args) {
        // Input: Accept user input for variable N
        int n = Integer.parseInt(System.console().readLine("Enter a number: "));

        // Compute N = (N + 110) / 111
        n = (n + 110) / 111;

        // Compute N = N * 111
        n = n * 111;

        // Output: Display the value of N
        System.out.println("Result: " + n);
    }
}