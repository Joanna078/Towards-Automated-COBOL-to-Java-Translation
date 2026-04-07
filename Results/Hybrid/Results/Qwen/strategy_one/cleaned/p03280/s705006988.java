import java.util.Scanner;

public class ABC_106_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Data section
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int tmp = a * b - (a + b - 1);
        int zs = tmp;
        
        // Logic section
        StringBuilder ans = new StringBuilder();
        if (zs == 0) {
            ans.append(0);
        } else {
            while (zs != 0) {
                ans.insert(0, zs % 10);
                zs /= 10;
            }
        }
        
        // Output section
        System.out.println(ans.toString());
    }
}