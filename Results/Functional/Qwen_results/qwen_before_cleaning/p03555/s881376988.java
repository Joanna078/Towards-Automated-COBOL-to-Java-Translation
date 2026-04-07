import java.util.Scanner;

public class ABC_077_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String c1 = scanner.next();
        String c2 = scanner.next();

        // Check if the first character of c1 matches the last character of c2,
        // the second character of c1 matches the second character of c2,
        // and the third character of c1 matches the first character of c2
        if (c1.charAt(0) == c2.charAt(2) && 
            c1.charAt(1) == c2.charAt(1) && 
            c1.charAt(2) == c2.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}