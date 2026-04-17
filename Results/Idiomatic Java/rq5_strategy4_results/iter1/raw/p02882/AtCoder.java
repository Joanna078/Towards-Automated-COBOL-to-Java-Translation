```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        String x = inp.substring(0, temp1);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int n = temp2 - temp1;
        String y = inp.substring(temp1, temp1 + n);

        temp2++;
        int temp3 = temp2;
        while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
            temp3++;
        }
        n = temp3 - temp2;
        String w = inp.substring(temp2, temp2 + n);

        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double c = Double.parseDouble(w) / a;

        if (c >= a * b / 2.0) {
            c -= a * b / 2.0;
            c = 2.0 * c / a;
            c = b - c;
            c = Math.atan(c / a);
        } else {
            c = 2.0 * c / b;
            c = Math.atan(b / c);
        }

        c = c * 180.0 / Math.PI;
        System.out.printf("%.9f%n", c);
    }
}
```