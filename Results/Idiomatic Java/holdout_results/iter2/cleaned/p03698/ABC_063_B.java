import java.util.Scanner;

public class ABC_063_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (containsDuplicateCharacters(input)) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    private static boolean containsDuplicateCharacters(String s) {
        boolean[] flags = new boolean[26];
        for (char c : s.toLowerCase().toCharArray()) {
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