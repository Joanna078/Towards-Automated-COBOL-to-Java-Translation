import java.util.Scanner;

public class ABC_106_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        String inp = scanner.nextLine();
        
        // Data section
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int tmp = a * b - (a + b - 1);
        
        // Logic section
        StringBuilder ans = new StringBuilder();
        if (tmp >= 0) {
            while (tmp != 0) {
                ans.insert(0, tmp % 10);
                tmp /= 10;
            }
        } else {
            ans.append("-");
            tmp = -tmp;
            while (tmp != 0) {
                ans.insert(1, tmp % 10);
                tmp /= 10;
            }
        }
        
        // Output section
        System.out.println(ans.toString());
    }
}