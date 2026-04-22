import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int S = scanner.nextInt();
        int NOW1 = 0, NOW2 = 0, NOW3 = 0;
        
        for (int T = 1; T <= S; T++) {
            String inp = scanner.next();
            
            int temp1 = 0;
            while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
                temp1++;
            }
            int A = Integer.parseInt(inp.substring(0, temp1));
            
            temp1 += 2;
            int temp2 = temp1;
            while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
                temp2++;
            }
            int N = temp2 - temp1;
            int B = Integer.parseInt(inp.substring(temp1, temp1 + N));
            
            temp1 += 1;
            int temp3 = temp1;
            while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
                temp3++;
            }
            N = temp3 - temp1;
            int C = Integer.parseInt(inp.substring(temp1, temp1 + N));
            
            int temp4 = A - NOW1;
            temp2 = B - NOW2;
            temp3 = C - NOW3;
            temp2 += temp3;
            
            if (temp4 < temp2) {
                System.out.println("No");
                return;
            }
            
            temp2 = temp4 / 2;
            temp4 = temp4 - temp2 * 2;
            
            temp2 = B - NOW2;
            temp3 = temp2 / 2;
            temp2 = temp2 - temp3 * 2;
            
            temp3 = C - NOW3;
            temp4 = temp3 / 2;
            temp3 = temp3 - temp4 * 2;
            temp2 += temp3;
            temp2 -= 2;
            
            if (temp2 == 2) {
                temp2 = 0;
            }
            
            if (temp4 != temp2) {
                System.out.println("No");
                return;
            }
            
            NOW1 = A;
            NOW2 = B;
            NOW3 = C;
        }
        
        System.out.println("Yes");
    }
}