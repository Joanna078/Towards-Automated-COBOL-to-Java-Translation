import java.util.Scanner;

public class Atcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a1 = Integer.parseInt(numbers[0]);
        int a2 = Integer.parseInt(numbers[1]);
        int a3 = Integer.parseInt(numbers[2]);
        int r2 = a1 * a2;
        int r = r2 / 2;
        System.out.println(String.format("%d", r));
    }
}