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
        String xStr = inp.substring(0, temp1 + 1);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int n = temp2 - temp1;
        String yStr = inp.substring(temp1, temp2);

        temp2 += 1;
        int temp3 = temp2;
        while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
            temp3++;
        }
        n = temp3 - temp2;
        String wStr = inp.substring(temp2, temp3);

        double x = Double.parseDouble(xStr);
        double y = Double.parseDouble(yStr);
        double w = Double.parseDouble(wStr);

        double a = x;
        double b = y;
        double c = w;
        c /= a;

        if (c >= a * b / 2.0) {
            c -= a * b / 2.0;
            c = 2.0 * c / a;
            c = Math.atan(c);
        } else {
            c = 2.0 * c / b;
            c = Math.atan(b / c);
        }

        c *= 180.0 / Math.PI;
        System.out.println(c);
    }
}