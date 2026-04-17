```java
import java.util.Scanner;

public class VowelConsonantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        scanner.close();

        if (isVowel(c)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
```