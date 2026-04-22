import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inp = scanner.nextLine();
        
        int s = Integer.parseInt(inp.trim());
        
        int now1 = 0;
        int now2 = 0;
        int now3 = 0;
        
        for (int t = 1; t <= s; t++) {
            inp = scanner.nextLine().trim();
            
            int temp1 = 0;
            while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
                temp1++;
            }
            if (temp1 > 0) {
                temp1--;
                int a = Integer.parseInt(inp.substring(0, temp1));
                
                temp1 += 2;
                int temp2 = temp1;
                while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
                    temp2++;
                }
                int n = temp2 - temp1;
                int b = Integer.parseInt(inp.substring(temp1, temp1 + n));
                
                temp2 += 1;
                temp1 = temp2;
                while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
                    temp1++;
                }
                n = temp1 - temp2;
                int c = Integer.parseInt(inp.substring(temp2, temp2 + n));
                
                if (a - now1 < b - now2 + c - now3) {
                    System.out.println("No");
                    return;
                }
                
                int temp3 = b - now2;
                int temp4 = temp3 / 2;
                temp3 -= temp4 * 2;
                temp2 = temp3 + temp2 - 2;
                if (temp2 == 2) {
                    temp2 = 0;
                }
                if (a - now1 != temp2) {
                    System.out.println("No");
                    return;
                }
                
                now1 = a;
                now2 = b;
                now3 = c;
            } else {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}