import java.util.Scanner;

public class ABC_053_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inp1 = new StringBuilder();
        
        // Read input from keyboard
        while (scanner.hasNextLine()) {
            inp1.append(scanner.nextLine());
        }
        
        int len = inp1.length();
        
        int i = 1;
        while (i <= len && inp1.charAt(i - 1) != 'A') {
            i++;
        }
        
        int j = len;
        while (j >= 1 && inp1.charAt(j - 1) != 'Z') {
            j--;
        }
        
        if (i <= j) {
            j++;
        }
        
        String zs = String.format("%07d", j - i + 1);
        
        String ans = unstring(zs);
        
        System.out.println(ans.substring(0, Math.min(ans.length(), 6)));
    }

    private static String unstring(String zs) {
        return zs.replaceAll("\\s+", "");
    }
}