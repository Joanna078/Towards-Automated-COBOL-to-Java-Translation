import java.util.Scanner;

public class Main {

    private static int returnCode;
    private static String inp;
    private static int k;
    private static int a;
    private static int b;
    private static int s1;
    private static int s2;
    private static int a1;
    private static int a2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter value for K: ");
        k = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter value for INP: ");
        inp = scanner.nextLine();

        // Unstring
        String[] parts = inp.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);

        // Divide
        s1 = a / k;
        a1 = a % k;
        s2 = b / k;
        a2 = b % k;

        // If condition
        if ((s1 >= 0 && s2 > 0) || (a1 == 0 && a > k)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        scanner.close();
    }
}