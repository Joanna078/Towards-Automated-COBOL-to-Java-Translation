import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        
        int n = Math.max(a, b);
        char[] out = new char[n];
        
        for (int i = 0; i < n; i++) {
            out[i] = (char) ('0' + a);
        }
        
        System.out.println(new String(out, 0, n));
    }
}