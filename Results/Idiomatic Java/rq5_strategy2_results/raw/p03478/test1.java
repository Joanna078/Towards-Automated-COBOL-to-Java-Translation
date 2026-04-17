```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        int a = Integer.parseInt(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int n = temp2 - temp1;
        int b = Integer.parseInt(inp.substring(temp1, temp2));

        temp1++;
        temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        n = temp2 - temp1;
        long c = Long.parseLong(inp.substring(temp1, temp2));

        a++;
        long ren = 0;
        for (int i = 1; i <= a; i++) {
            int temp3 = 0;
            int temp1Copy = temp1;
            int temp2Copy = i;
            for (int j = 0; j < 5; j++) {
                temp3 = temp2Copy / 10;
                temp1Copy = temp1Copy + temp2Copy - temp3 * 10;
                temp2Copy = temp3;
            }
            if (temp1Copy >= b && temp1Copy <= c) {
                ren += i;
            }
        }

        System.out.printf("%010d%n", ren);
    }
}
```