```java
import java.util.Scanner;

public class Test1 {

    private int returnCode;
    private int price;
    private int result;
    private String topping;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.execute();
    }

    public void execute() {
        initialize();
        process();
    }

    private void initialize() {
        returnCode = 0;
        price = 0;
        result = 0;
        topping = "   ";
    }

    private void process() {
        Scanner scanner = new Scanner(System.in);

        // MOVE "0700" TO PRICE
        price = 700;

        // ACCEPT TOPPING
        System.out.print("Enter topping: ");
        topping = scanner.nextLine().trim();

        // IF TOPPING(1:1) = "o"
        if (topping.charAt(0) == 'o') {
            price += 100;
        }

        // IF TOPPING(2:1) = "o"
        if (topping.length() > 1 && topping.charAt(1) == 'o') {
            price += 100;
        }

        // IF TOPPING(3:1) = "o"
        if (topping.length() > 2 && topping.charAt(2) == 'o') {
            price += 100;
        }

        // IF PRICE = 1000
        if (price == 1000) {
            System.out.println("Price is 1000");
        } else {
            result = price;
            System.out.println("Result: " + result);
        }

        // STOP RUN
        System.exit(returnCode);
    }
}
```