```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().trim();

        if (inp.isEmpty()) {
            System.out.println("0000000000");
            return;
        }

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        String aStr = inp.substring(0, temp1);
        int a = Integer.parseInt(aStr);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        String bStr = inp.substring(temp1, temp2);
        int b = Integer.parseInt(bStr);

        temp2++;
        int temp3 = temp2;
        while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
            temp3++;
        }
        String cStr = inp.substring(temp2, temp3);
        long c = Long.parseLong(cStr);

        a++;
        long ren = 0;
        for (int n = 1; n <= a; n++) {
            int temp1Val = 0;
            int temp2Val = n;
            for (int i = 0; i < 5; i++) {
                temp1Val = temp1Val + temp2Val - (temp2Val / 10) * 10;
                temp2Val = temp2Val / 10;
            }
            if (temp1Val >= b && temp1Val <= c) {
                ren += n;
            }
        }

        System.out.printf("%010d%n", ren);
    }
}
```