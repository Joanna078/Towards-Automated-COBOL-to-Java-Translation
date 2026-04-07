public class ABC_053_A {
    public static void main(String[] args) {
        // Declare and initialize variable x
        int x = Integer.parseInt(System.console().readLine());

        // Check the value of x and display the appropriate message
        if (x < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}