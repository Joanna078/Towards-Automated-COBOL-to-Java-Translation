public class Main {
    public static void main(String[] args) {
        // Check if there is at least one argument
        if (args.length > 0) {
            // Define the input variable
            int x = Integer.parseInt(args[0]);

            // Check the condition and print the result
            if (x >= 30) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No input provided");
        }
    }
}