public class ProgramId {
    public static void main(String[] args) {
        // Check if the command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        // Input from user or predefined value
        int n = Integer.parseInt(args[0]);

        // Compute the result
        double ans = (double) n / 2 + 0.9;

        // Output the result
        System.out.println(ans);
    }
}