import java.util.Scanner;

public class ABC_063_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (containsDuplicateCharacters(input)) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    private static boolean containsDuplicateCharacters(String s) {
        int len = s.length();
        boolean[] flags = new boolean[26];
        for (int i = 0; i < len; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                if (flags[c - 'a']) {
                    return true;
                }
                flags[c - 'a'] = true;
            }
        }
        return false;
    }
}