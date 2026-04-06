import java.util.Scanner;

public class ABC_081_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String inp = scanner.nextLine();
        
        int cnt = 0;
        
        // Count occurrences of '1'
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == '1') {
                cnt++;
            }
        }
        
        // Convert count to string
        String zs = String.format("%d", cnt);
        
        // Reverse the string
        StringBuilder sb = new StringBuilder(zs).reverse();
        String ans = sb.toString();
        
        // Output
        System.out.println(ans);
    }
}