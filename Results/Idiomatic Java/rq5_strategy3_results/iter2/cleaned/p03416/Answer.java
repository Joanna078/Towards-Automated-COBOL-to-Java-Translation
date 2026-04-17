import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read input values
            int a = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            int b = scanner.nextInt();
            
            int ans = 0;
            
            // Loop from a to b
            for (int i = a; i <= b; i++) {
                String iStr = String.valueOf(i);
                if (iStr.length() == 5 && iStr.charAt(0) == iStr.charAt(4) && iStr.charAt(1) == iStr.charAt(3)) {
                    ans++;
                }
            }
            
            // Output the result
            System.out.printf("%04d%n", ans);
        }
    }
}