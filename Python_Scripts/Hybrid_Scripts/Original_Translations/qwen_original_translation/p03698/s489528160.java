import java.util.Scanner;

public class ABC_063_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String s = scanner.nextLine();
        
        int len = s.length();
        boolean[] flg = new boolean[26];
        boolean used = false;
        
        // Initialize flag array
        for (int i = 0; i < 26; i++) {
            flg[i] = false;
        }
        
        // Check each character in the string
        for (int i = 0; i < len && !used; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!flg[index]) {
                    flg[index] = true;
                } else {
                    used = true;
                }
            }
        }
        
        // Output result
        if (used) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
        
        scanner.close();
    }
}