```java
import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;

        if (temp1 >= 0) {
            String aStr = inp.substring(0, temp1 + 1);
            int a = Integer.parseInt(aStr);

            temp1 += 2;
            int temp2 = temp1;
            while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
                temp2++;
            }

            int n = temp2 - temp1;
            if (n > 0) { // Check if there is a valid number for B
                String bStr = inp.substring(temp1, temp2);
                int b = Integer.parseInt(bStr);

                int c = a * b;
                if (a <= 9 && b <= 9) {
                    System.out.println(c);
                } else {
                    System.out.println("-1");
                }
            } else {
                System.out.println("-1");
            }
        } else {
            System.out.println("-1");
        }
    }
}
```