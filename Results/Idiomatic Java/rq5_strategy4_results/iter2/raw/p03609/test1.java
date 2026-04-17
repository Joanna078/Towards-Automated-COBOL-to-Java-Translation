```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < input.length() && input.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;

        String aStr = input.substring(0, temp1);
        long A = Long.parseLong(aStr);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < input.length() && input.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        long B = Long.parseLong(input.substring(temp1, temp1 + N));

        if (A >= B) {
            A -= B;
        } else {
            A = 0;
        }

        System.out.printf("%09d%n", A);
    }
}
```