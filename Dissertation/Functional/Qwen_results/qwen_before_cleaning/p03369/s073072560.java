import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int price = 700;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter topping (ooo): ");
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
        
        if (price == 1000) {
            System.out.println(1000);
        } else {
            System.out.println(price);
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL's `PICTURE` clauses with Java's primitive data types (`int`).
2. **Input/Output**: Used `Scanner` for input from `System.in` and `System.out.println` for output.
3. **String Handling**: Used `charAt` method to check individual characters in the string.
4. **Conditional Statements**: Kept the conditional logic similar to the original COBOL program.
5. **Java 17 Features**: No specific Java 17 features were used as the logic was straightforward.