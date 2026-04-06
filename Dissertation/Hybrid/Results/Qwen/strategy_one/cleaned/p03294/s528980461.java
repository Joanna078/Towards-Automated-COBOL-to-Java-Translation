import java.util.Scanner;

public class ABC_103_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        long sm = 0;
        int maxlen = 3000;
        int cur = 0;
        int i = 1;
        
        while (i <= maxlen && cur < inp.length()) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            
            int len = j - cur;
            String a = inp.substring(cur, cur + len);
            int numA = Integer.parseInt(a) - 1;
            sm += numA;
            
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