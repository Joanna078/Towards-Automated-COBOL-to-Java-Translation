import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept N from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int cnt = 0;
        
        // Perform nested loops
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    int res = a * b + c;
                    
                    if (res > n) {
                        break;
                    }
                    
                    if (res == n) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        
        // Display the result
        System.out.println(cnt);
        
        scanner.close();
    }
}