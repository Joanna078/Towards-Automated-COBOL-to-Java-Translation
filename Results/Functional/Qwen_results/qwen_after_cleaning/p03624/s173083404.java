import java.util.Scanner;

public class ABC_071_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int[] f = new int[26];
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') break;
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == alpha.charAt(j)) {
                    f[j]++;
                }
            }
        }

        boolean found = false;
        for (int i = 0; i < 26; i++) {
            if (f[i] == 0) {
                System.out.println(alpha.charAt(i));
                found = true;
                break;
            } else if (i == 25) {
                System.out.println("None");
            }
        }
    }
}