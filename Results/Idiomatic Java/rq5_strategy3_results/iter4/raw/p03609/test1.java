```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        String aStr = inp.substring(0, temp1);
        long a = Long.parseLong(aStr);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int n = temp2 - temp1;
        String bStr = inp.substring(temp1, temp2);
        long b = Long.parseLong(bStr);

        if (a >= b) {
            a -= b;
        } else {
            a = 0;
        }

        System.out.printf("%09d%n", a);
    }
}
```