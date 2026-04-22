import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        // Split input string into two parts
        String[] parts = inp.split(" ");
        String s = parts[0];
        String t = parts[1];
        
        // Create a StringBuilder to hold the result
        StringBuilder st = new StringBuilder();
        
        // Perform the loop using Java 17 features
        for (int i = 0; i < n; i++) {
            st.append(s.charAt(i));
            st.append(t.charAt(i));
        }
        
        // Display the result
        System.out.println(st.toString());
        
        scanner.close();
    }
}