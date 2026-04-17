```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine().trim();
        scanner.close();

        if (input.isEmpty()) {
            System.out.println(3);
            return;
        }

        int temp1 = 0;
        while (temp1 < input.length() && input.charAt(temp1) != ' ') {
            temp1++;
        }
        String A = input.substring(0, temp1);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < input.length() && input.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        String B = input.substring(temp1, temp2);

        temp2 += 1;
        temp1 = temp2;
        while (temp1 < input.length() && input.charAt(temp1) != ' ') {
            temp1++;
        }
        N = temp1 - temp2;
        String C = input.substring(temp2, temp1);

        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        if ((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) {
            System.out.println(2);
        } else if (a == c && b == c) {
            System.out.println(1);
        } else {
            System.out.println(3);
        }
    }
}
```