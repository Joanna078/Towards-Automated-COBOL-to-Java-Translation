import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        int cnt = parts.length;
        String out = "Yes";
        int sw = 0;

        for (int i = 0; i < cnt && "Yes".equals(out); i++) {
            char x = parts[i].charAt(0);
            if (!((sw == 0 && (x == 'R' || x == 'U' || x == 'D')) ||
                  (sw == 1 && (x == 'L' || x == 'U' || x == 'D')))) {
                out = "No";
            }
            sw = 1 - sw;
        }

        System.out.println(out);
    }
}