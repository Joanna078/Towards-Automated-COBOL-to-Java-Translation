```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();

        int index = 0;
        while (index < characters.length && characters[index] != ' ') {
            index++;
        }

        int index2 = index - 1;
        int index3 = index - 3;

        if (index3 < 0 || index2 >= characters.length) {
            System.out.println("Error: Index out of bounds");
        } else {
            System.out.println(characters[0] + Integer.toString(index3) + characters[index2]);
        }
    }
}
```