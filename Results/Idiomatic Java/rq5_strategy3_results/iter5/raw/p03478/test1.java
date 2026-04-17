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
        int A = Integer.parseInt(input.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < input.length() && input.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        int B = Integer.parseInt(input.substring(temp1, temp1 + N));

        temp1++;
        temp2 = temp1;
        while (temp2 < input.length() && input.charAt(temp2) != ' ') {
            temp2++;
        }
        N = temp2 - temp1;
        long C = Long.parseLong(input.substring(temp1, temp1 + N));

        A++;

        long REN = 0;
        for (int i = 1; i < A; i++) {
            int temp3 = 0;
            int temp1Copy = 0;
            int temp2Copy = i;
            for (int j = 0; j < 5; j++) {
                temp3 = temp2Copy / 10;
                temp1Copy = temp1Copy + temp2Copy - temp3 * 10;
                temp2Copy = temp3;
            }
            if (temp1Copy >= B && temp1Copy <= C) {
                REN += i;
            }
        }

        System.out.printf("%010d%n", REN);
    }
}
```