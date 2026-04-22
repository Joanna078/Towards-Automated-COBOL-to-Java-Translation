import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        String out = "Yes";
        int sw = 0;

        for (String part : parts) {
            if (part.isEmpty()) continue;
            char x = part.charAt(0);
            if (!((sw == 0 && (x == 'R' || x == 'U' || x == 'D')) ||
                  (sw == 1 && (x == 'L' || x == 'U' || x == 'D')))) {
                out = "No";
                break;
            }
            sw = 1 - sw;
        }

        System.out.println(out);
    }
}