import java.util.*;

public class SORTNUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            String num = scanner.next();
            String[] digits = num.split(" ");
            int d1 = Integer.parseInt(digits[0]);
            int d2 = Integer.parseInt(digits[1]);
            
            if (d1 == d2) {
                cnt++;
                
                if (cnt == 3) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                cnt = 0;
            }
        }
        
        if (cnt != 3) {
            System.out.println("No");
        }
    }
}
