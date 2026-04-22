```java
import java.util.Scanner;

public class ABC_063_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three characters: ");
        String inp = scanner.nextLine().trim();

        if (inp.length() != 3) {
            System.out.println("error");
            return;
        }

        char a = inp.charAt(0);
        char b = inp.charAt(1);

        if (!Character.isDigit(a) || !Character.isDigit(b)) {
            System.out.println("error");
            return;
        }

        int numA = Character.getNumericValue(a);
        int numB = Character.getNumericValue(b);
        int tmp = numA + numB;

        String zs = String.format("%03d", tmp);
        String ans = zs.substring(1);

        if (tmp >= 10) {
            System.out.println("error");
        } else {
            System.out.println(ans);
        }
    }
}
```