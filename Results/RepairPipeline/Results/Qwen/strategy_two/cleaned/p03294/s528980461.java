import java.util.Scanner;

public class ABC_103_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sm = 0;
        int maxlen = 3000;
        int cur = 0; // Changed from 1 to 0 to correctly index substring
        int i = 1;
        
        while (i <= maxlen && cur < inp.length()) { // Added condition to check cur < inp.length()
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') { // Changed j - 1 to j to correctly index character
                j++;
            }
            
            if (j > cur) { // Check if there is a valid number to parse
                int len = j - cur;
                String a = inp.substring(cur, j); // Corrected substring indices
                int numA = Integer.parseInt(a) - 1;
                sm += numA;
            }
            
            cur = j + 1;
            i++;
        }
        
        String zs = Long.toString(sm);
        
        StringBuilder ans = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
        
        System.out.println(ans.toString().trim());
    }
}