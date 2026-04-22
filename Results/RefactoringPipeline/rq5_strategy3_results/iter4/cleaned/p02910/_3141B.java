import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        int cnt = parts.length;
        boolean sw = false;
        String out = "Yes";

        for (int i = 0; i < cnt && "Yes".equals(out); i++) {
            char x = parts[i].charAt(0);
            if (!((sw && isRUD(x)) || (!sw && isLUD(x)))) {
                out = "No";
            }
            sw = !sw;
        }

        System.out.println(out);
    }

    private static boolean isRUD(char c) {
        return c == 'R' || c == 'U' || c == 'D';
    }

    private static boolean isLUD(char c) {
        return c == 'L' || c == 'U' || c == 'D';
    }
}