import java.util.Scanner;

public class ABC_101_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String s = scanner.nextLine();
        
        int ss = 0;
        
        // Perform loop
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                ss++;
            } else {
                ss--;
            }
        }
        
        // Convert result to string
        String ans = Integer.toString(ss);
        
        // Display output
        System.out.println(ans);
        
        scanner.close();
    }
}