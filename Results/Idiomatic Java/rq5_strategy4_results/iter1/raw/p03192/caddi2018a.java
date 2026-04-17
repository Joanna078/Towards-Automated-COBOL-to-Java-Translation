```java
import java.util.Scanner;

public class Caddi2018a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        scanner.close();

        int countOfTwos = countTwos(input);
        System.out.println(countOfTwos);
    }

    private static int countTwos(String number) {
        int count = 0;
        for (char c : number.toCharArray()) {
            if (c == '2') {
                count++;
            }
        }
        return count;
    }
}
```