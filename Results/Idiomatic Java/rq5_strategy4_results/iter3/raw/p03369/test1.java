```java
import java.util.Scanner;

public class Test1 {
    private static final int BASE_PRICE = 700;
    private static final int MAX_PRICE = 1000;
    private static final int TOPPING_PRICE_INCREMENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter topping (up to 3 characters): ");
        String topping = scanner.nextLine().substring(0, 3);
        scanner.close();

        int price = BASE_PRICE;
        for (char c : topping.toCharArray()) {
            if (c == 'o') {
                price += TOPPING_PRICE_INCREMENT;
            }
        }

        if (price > MAX_PRICE) {
            System.out.println(MAX_PRICE);
        } else {
            System.out.println(price);
        }
    }
}
```