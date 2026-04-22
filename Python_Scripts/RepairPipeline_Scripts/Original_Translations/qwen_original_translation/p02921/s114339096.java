import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input variables
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        int len = 3;
        int ans = 0;
        
        // Loop through each character of the strings
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                ans++;
            }
        }
        
        // Output the result
        System.out.println(ans);
    }
}