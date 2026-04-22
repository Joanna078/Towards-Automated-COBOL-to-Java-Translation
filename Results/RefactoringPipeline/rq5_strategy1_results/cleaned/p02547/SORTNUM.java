import java.util.Scanner;

public class SortNum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            if (input.length() == 2 && input.charAt(0) == input.charAt(1)) {
                count++;
                if (count == 3) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                count = 0;
            }
        }

        System.out.println("No");
    }
}