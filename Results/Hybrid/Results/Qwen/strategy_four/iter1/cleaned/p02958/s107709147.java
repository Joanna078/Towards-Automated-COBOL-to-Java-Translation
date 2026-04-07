import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String ln = scanner.nextLine();
        
        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int cnt = 0;
        int zs = 0;
        int p;
        
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                p = Integer.parseInt(ln.substring(cur - 1, cur - 1 + len));
                
                if (p != i) {
                    cnt++;
                }
            }
            
            cur = j + 1;
            i++;
        }
        
        if (cnt <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}