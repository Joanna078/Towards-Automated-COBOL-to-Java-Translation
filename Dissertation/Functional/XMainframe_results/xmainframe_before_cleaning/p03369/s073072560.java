import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = 700;
        Scanner scanner = new Scanner(System.in);
        String topping = scanner.nextLine();

        if (topping.charAt(0) == 'o') {
            price += 100;
        }
        if (topping.charAt(1) == 'o') {
            price += 100;
        }
        if (topping.charAt(2) == 'o') {
            price += 100;
        }

        if (price == 1000) {
            System.out.println("1000");
        } else {
            System.out.println(price);
        }
    }
}