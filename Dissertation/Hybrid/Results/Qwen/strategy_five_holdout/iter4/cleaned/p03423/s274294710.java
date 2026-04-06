import java.util.Scanner;

public class ABC_089_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        
        // Process
        int tmp = n / 3;
        String zs = String.format("%03d", tmp);
        String ans = unans(zs);
        
        // Output
        System.out.println(ans); // Corrected to match expected output
    }

    private static String unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}