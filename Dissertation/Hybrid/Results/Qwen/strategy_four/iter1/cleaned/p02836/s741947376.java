import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String inp = scanner.nextLine();
        
        // Processing
        int n = inp.length();
        char[] s = inp.toCharArray();
        int h = 0;
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            if (s[i] != s[j]) {
                h++;
            }
            i++;
            j--;
        }
        
        // Output
        System.out.println(h);
        
        scanner.close();
    }
}