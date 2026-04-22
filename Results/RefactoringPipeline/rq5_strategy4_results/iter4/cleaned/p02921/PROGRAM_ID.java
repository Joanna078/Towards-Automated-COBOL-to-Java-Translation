import java.util.Scanner;

public class ProgramId {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input strings S and T
        System.out.print("Enter string S: ");
        String S = scanner.nextLine();
        System.out.print("Enter string T: ");
        String T = scanner.nextLine();

        int len = Math.min(S.length(), T.length());
        int ans = 0;

        // Compare characters of S and T up to the length of the shorter string
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == T.charAt(i)) {
                ans++;
            }
        }

        // Display the result
        System.out.println(ans);
    }
}