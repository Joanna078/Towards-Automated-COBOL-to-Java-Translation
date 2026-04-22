```java
import java.util.Scanner;

public class ABC_071_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        boolean[] found = new boolean[26];

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                int index = findIndex(alphabet, c);
                if (index != -1) {
                    found[index] = true;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!found[i]) {
                System.out.println(alphabet[i]);
                return;
            }
        }

        System.out.println("None");
    }

    private static int findIndex(char[] array, char value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
```