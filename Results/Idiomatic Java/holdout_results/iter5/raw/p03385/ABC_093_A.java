```java
import java.util.Scanner;

public class ABC_093_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of up to 4 characters: ");
        String inp = scanner.nextLine();
        scanner.close();

        boolean hasA = false;
        boolean hasB = false;
        boolean hasOther = false;

        for (int i = 0; i < Math.min(inp.length(), 3); i++) {
            char ch = inp.charAt(i);
            switch (ch) {
                case 'a':
                    hasA = true;
                    break;
                case 'b':
                    hasB = true;
                    break;
                default:
                    hasOther = true;
            }
        }

        if (hasA && hasB && hasOther) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```