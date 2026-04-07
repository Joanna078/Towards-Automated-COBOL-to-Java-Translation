import java.util.Scanner;

public class ABC_107_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input (format: N i): ");
        String inp = scanner.nextLine();
        
        // Data division
        int n = 0;
        int i = 0;
        String[] parts = inp.split("\\s+");
        if (parts.length == 2) {
            n = Integer.parseInt(parts[0]);
            i = Integer.parseInt(parts[1]);
        }
        
        // Processing section
        i = n - i;
        i++;
        
        // Output section
        String ans = String.format("%03d", i);
        unans(ans);
        
        System.out.println(ans.trim());
    }

    private static void unans(String ans) {
        StringBuilder sb = new StringBuilder();
        for (char c : ans.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        ans = sb.toString();
    }
}