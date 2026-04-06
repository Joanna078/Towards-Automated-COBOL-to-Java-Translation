import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a, b, c;
        int ans1, ans2;

        String[] numbers = input.split(" ");
        a = Integer.parseInt(numbers[0]);
        b = Integer.parseInt(numbers[1]);
        c = Integer.parseInt(numbers[2]);

        ans1 = b - a;
        ans2 = c - b;

        if (ans1 == ans2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
