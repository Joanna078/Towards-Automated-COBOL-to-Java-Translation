import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ln = scanner.nextLine();
        
        String[] parts = ln.split(" ");
        String S = parts[0];
        String T = parts.length > 1 ? parts[1] : "";
        
        String ans = T.trim() + S.trim();
        
        System.out.println(ans.trim());
    }
}