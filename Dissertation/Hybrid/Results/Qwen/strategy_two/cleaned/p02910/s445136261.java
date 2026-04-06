import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String s = scanner.nextLine();
        
        // Process
        String[] parts = s.split(" ");
        int cnt = parts.length;
        boolean sw = false; // 0 in COBOL is represented as false
        String out = "Yes";
        
        for (int i = 0; i < cnt && out.equals("Yes"); i++) {
            char x = parts[i].charAt(0);
            if (!((sw && (x == 'R' || x == 'U' || x == 'D')) || (!sw && (x == 'L' || x == 'U' || x == 'D')))) {
                out = "No";
            }
            sw = !sw;
        }
        
        // Output
        System.out.println(out);
    }
}