import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        int cnt = 0;
        int max = 0;
        int p1 = 0;
        
        // Process
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            String h = inp.substring(p1, p2);
            int hValue = Integer.parseInt(h);
            
            if (hValue >= max) {
                cnt++;
            }
            if (hValue > max) {
                max = hValue;
            }
            
            p1 = p2 + 1;
        }
        
        // Output
        System.out.println(cnt);
    }
}