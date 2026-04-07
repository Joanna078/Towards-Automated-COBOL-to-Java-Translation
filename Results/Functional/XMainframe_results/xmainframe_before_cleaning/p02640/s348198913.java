import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int x = Integer.parseInt(input.split(" ")[0]);
        int y = Integer.parseInt(input.split(" ")[1]);
        int i;
        for (i = 1; i <= x && i * 2 + (x - i) * 4 != y && i * 4 + (x - i) * 2 != y; i++);
        if (i <= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}