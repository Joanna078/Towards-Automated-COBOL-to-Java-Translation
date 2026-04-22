```java
import java.util.Scanner;

public class Caddi2018a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int countOfTwos = countTwos(input);
        System.out.println(countOfTwos);
    }

    private static int countTwos(String input) {
        return (int) input.chars().filter(c -> c == '2').count();
    }
}
```