public class ABC_053_A {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int x = scanner.nextInt();

        // Process
        if (x < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
        scanner.close();
    }
}