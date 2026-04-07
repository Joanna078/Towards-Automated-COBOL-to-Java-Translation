import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Data
        int n = Integer.parseInt(inp.split(" ")[0]);
        int k = Integer.parseInt(inp.split(" ")[1]);
        int s = k / 2;
        int a = k % 2;
        double s1 = (double) n / k;
        int f1 = (int) s1;
        int s2 = (int) ((s1 - f1) * 10);
        long cnt = 0;
        String out = "";
        
        // Logic
        if (a == 1) {
            cnt = (long) Math.pow(f1, 3);
        } else {
            cnt = (long) Math.pow(f1, 3);
            if (s2 < 5) {
                cnt += (long) Math.pow(f1, 3);
            } else {
                cnt += (long) Math.pow(f1 + 1, 3);
            }
        }
        
        // Output
        out = String.format("%017d", cnt).replace(' ', '0');
        System.out.println(out.trim());
        
        scanner.close();
    }
}