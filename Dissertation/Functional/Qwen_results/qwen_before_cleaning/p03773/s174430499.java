import java.util.Scanner;

public class ABC_057_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input (A B): ");
        String inp = scanner.nextLine();
        
        // Working storage section
        int a = 0;
        int b = 0;
        int ans = 0;
        int zs = 0;
        char dummy = ' ';
        
        // Procedure division
        String[] parts = inp.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        
        a += b;
        
        if (a >= 24) {
            a -= 24;
        }
        
        zs = a;
        
        unans(zs, dummy, ans);
        
        System.out.println(ans);
    }

    private static void unans(int zs, char dummy, int ans) {
        StringBuilder sb = new StringBuilder(Integer.toString(zs));
        while (sb.length() > 0) {
            dummy = sb.charAt(0);
            ans = Character.getNumericValue(dummy);
            sb.deleteCharAt(0);
        }
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It uses modern Java 17 features such as `StringBuilder` for string manipulation and `Scanner` for input handling. The `unans` method is implemented using a `StringBuilder` to simulate the UNSTRING operation from COBOL.