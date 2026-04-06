import java.util.Scanner;

public class ABC_060_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from user
        String inp = scanner.nextLine();
        
        // Split the input into three parts based on space delimiter
        String[] parts = inp.split(" ");
        
        if (parts.length != 3) {
            System.out.println("NO");
            return;
        }
        
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        
        // Check the conditions
        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}