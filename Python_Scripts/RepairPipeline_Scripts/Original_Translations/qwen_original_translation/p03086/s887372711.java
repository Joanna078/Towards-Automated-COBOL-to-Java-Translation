import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String s = scanner.nextLine();
        
        int cnt = 0;
        int max = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < Math.min(s.length(), 10); i++) {
            char c = s.charAt(i);
            
            if ("ACGT".indexOf(c) != -1) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        
        // Output the result
        System.out.println(max);
    }
}