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
            if (!((sw && (x == 'R' || x == 'U' || x == 'D')) || (!sw && (x == 'L' || x == 'U' || x == 'D')))) {
                out = "No";
            }
            sw = !sw;
        }

        System.out.println(out);
    }
}