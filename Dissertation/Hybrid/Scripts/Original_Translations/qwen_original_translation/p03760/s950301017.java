import java.util.Scanner;

public class ABC_058_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        String o = scanner.nextLine();
        String e = scanner.nextLine();

        // Calculate length of string O
        int len = o.length();

        StringBuilder ans = new StringBuilder();

        // Loop through each character of string O and E
        for (int i = 0; i < len; i++) {
            ans.append(o.charAt(i)).append(e.charAt(i));
        }

        // Output the result
        System.out.println(ans.toString());
    }
}