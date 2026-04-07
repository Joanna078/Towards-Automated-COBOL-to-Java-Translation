import java.util.Arrays;
import java.util.Scanner;

public class ABC_042_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int l = Integer.parseInt(parts[1]);
        
        // Array initialization
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine().substring(0, l);
        }
        
        // Sorting
        Arrays.sort(s);
        
        // Result construction
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(s[i], 0, l);
        }
        
        // Output
        System.out.println(ans.toString());
    }
}