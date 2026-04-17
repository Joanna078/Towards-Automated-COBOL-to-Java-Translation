import java.util.Scanner;

public class ABC_077_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter C1: ");
        String c1 = scanner.nextLine();

        System.out.print("Enter C2: ");
        String c2 = scanner.nextLine();

        if (isReversedMatch(c1, c2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    private static boolean isReversedMatch(String c1, String c2) {
        return c1.length() == 3 && c2.length() == 3 &&
               c1.charAt(0) == c2.charAt(2) &&
               c1.charAt(1) == c2.charAt(1) &&
               c1.charAt(2) == c2.charAt(0);
    }
}