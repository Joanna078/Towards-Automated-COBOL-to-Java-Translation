import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int sum = a + b;
        int x = sum / 2;
        int remainder = sum % 2;
        if (remainder == 0) {
            System.out.println(x);
        } else {
            System.out.println(x + 1);
        }
    }
}
