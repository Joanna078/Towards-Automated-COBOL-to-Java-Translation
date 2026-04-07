```java
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int price = 700;
        Scanner scanner = new Scanner(System.in);
        String topping = scanner.nextLine();
        
        if (topping.charAt(0) == 'o') {
            price += 100;
        }
        if (topping.length() > 1 && topping.charAt(1) == 'o') {
            price += 100;
        }
        if (topping.length() > 2 && topping.charAt(2) == 'o') {
            price += 100;
        }
        
        System.out.println(price);
        
        scanner.close();
    }
}
```