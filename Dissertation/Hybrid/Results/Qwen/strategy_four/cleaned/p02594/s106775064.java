public class Main {
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("No");
            return;
        }

        // Define the input variable
        int x = Integer.parseInt(args[0]);

        // Check the condition and print the result
        if (x >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}