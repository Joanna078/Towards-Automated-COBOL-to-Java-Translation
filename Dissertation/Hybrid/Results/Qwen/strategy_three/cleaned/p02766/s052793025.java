import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a string: ");
        String ln = scanner.nextLine();
        
        // Processing
        int n = Integer.parseInt(ln.split(" ")[0]);
        int k = Integer.parseInt(ln.split(" ")[1]);
        int cnt = 1;
        
        while (n >= Math.pow(k, cnt)) {
            cnt++;
        }
        
        // Output
        System.out.println(cnt - 1);
        
        scanner.close();
    }
}