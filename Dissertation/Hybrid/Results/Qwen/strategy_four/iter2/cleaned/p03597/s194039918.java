import java.util.Scanner;

public class ABC_074_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int n;
        int a;
        StringBuilder ans = new StringBuilder();

        // Input section
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        System.out.print("Enter A: ");
        a = scanner.nextInt();

        // Logic section
        n = (int) Math.pow(n, 2);
        n -= a;

        // Convert result to string
        String zs = String.format("%06d", n);

        // Perform UNANS section
        unans(zs, ans);

        // Output section
        System.out.println(ans.substring(1)); // Trim leading zero

        scanner.close();
    }

    private static void unans(String zs, StringBuilder ans) {
        // Unstring logic
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
    }
}