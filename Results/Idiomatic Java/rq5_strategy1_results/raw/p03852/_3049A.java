```java
import java.util.Scanner;

public class VowelConsonantChecker {

    private static final String VOWEL = "vowel";
    private static final String CONSONANT = "consonant";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        String result = checkVowelOrConsonant(inputChar);
        System.out.println(result);
    }

    private static String checkVowelOrConsonant(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return VOWEL;
            default:
                return CONSONANT;
        }
    }
}
```