import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // WORKING-STORAGE SECTION
        int n;
        int i;
        int qt;
        int rm;
        int ans = 0;
        int num;
        
        // ACCEPT N
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        
        // PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        for (i = 1; i <= n; i++) {
            // COMPUTE num = FUNCTION LOG10(i)
            num = (int) Math.log10(i);
            
            // ADD 1 TO num
            num += 1;
            
            // DIVIDE num BY 2 GIVING qt REMAINDER rm
            qt = num / 2;
            rm = num % 2;
            
            // IF rm = 1
            if (rm == 1) {
                // ADD 1 TO ans
                ans += 1;
            }
        }
        
        // DISPLAY ans
        System.out.println(ans);
        
        scanner.close();
    }
}