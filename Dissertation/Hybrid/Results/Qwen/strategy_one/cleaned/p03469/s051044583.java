public class Already {
    public static void main(String[] args) {
        // Declare a string variable with a fixed length of 10 characters
        String s = new String(new char[10]).replace('\0', ' ');

        // Read input from the user (assuming it's provided as a command-line argument)
        if (args.length > 0) {
            s = args[0];
        }

        // Replace the first 4 characters with "2018"
        s = "2018" + s.substring(4);

        // Print the modified string
        System.out.println(s);
    }
}