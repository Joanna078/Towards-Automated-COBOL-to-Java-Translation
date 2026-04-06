import java.util.Scanner;

public class ABC_103_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sm = 0;
        int maxlen = n;
        int cur = 1;
        int i = 1;
        
        while (i <= maxlen) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            
            if (j > cur) { // Ensure there is a number to process
                int len = j - cur;
                String a = inp.substring(cur - 1, cur - 1 + len);
                int numA = Integer.parseInt(a) - 1;
                sm += numA;
            }
            
            cur = j + 1;
            i++;
        }
        
        String zs = String.format("%010d", sm);
        
        StringBuilder ans = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
        
        System.out.println(ans.toString().trim());
    }
}