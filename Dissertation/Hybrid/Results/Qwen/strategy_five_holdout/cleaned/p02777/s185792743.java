import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String ln = scanner.nextLine();
        String[] parts = ln.split(" ");
        String s = parts[0];
        String t = parts[1];
        
        ln = scanner.nextLine();
        parts = ln.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        String u = scanner.nextLine();
        
        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }
        
        StringBuilder zs = new StringBuilder(String.format("%02d", a));
        StringBuilder ans = new StringBuilder();
        unans(zs, ans);
        
        String z = ans.toString().trim();
        
        zs = new StringBuilder(String.format("%02d", b));
        ans = new StringBuilder();
        unans(zs, ans);
        
        z += " " + ans.toString().trim();
        System.out.println(z.trim());
        
        scanner.close();
    }

    private static void unans(StringBuilder zs, StringBuilder ans) {
        while (zs.length() > 0 && Character.isWhitespace(zs.charAt(0))) {
            zs.deleteCharAt(0);
        }
        ans.append(zs);
    }
}