import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input size
        int n = Integer.parseInt(scanner.nextLine());
        
        // Read input string
        String inp = scanner.nextLine();
        
        // Initialize variables
        int rC = 0;
        int cnt = 0;
        
        // Count occurrences of 'R' in the input string
        for (char c : inp.toCharArray()) {
            if (c == 'R') {
                rC++;
            }
        }
        
        // Count occurrences of 'W' in the first rC characters
        for (int i = 0; i < rC; i++) {
            if (inp.charAt(i) == 'W') {
                cnt++;
            }
        }
        
        // Output the result
        System.out.println(cnt);
        
        scanner.close();
    }
}