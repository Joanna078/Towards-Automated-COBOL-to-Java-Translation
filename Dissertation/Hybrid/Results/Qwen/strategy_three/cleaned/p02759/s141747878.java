public class ProgramId {
    public static void main(String[] args) {
        // Input from user or predefined value
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);

        // Compute the result
        double ans = (double) n / 2 + 0.9;

        // Output the result
        System.out.println(ans);
    }
}