import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double angle = Math.abs((h * 30 + m * 0.5) - (m * 6));
        if (angle > 180) angle = 360 - angle;
        double cnt;
        if (angle == 0) cnt = a - b;
        else if (angle == 90) cnt = Math.sqrt(a * a + b * b);
        else if (angle == 180) cnt = a + b;
        else cnt = Math.sqrt((a * a + b * b) - (2 * a * b * Math.cos(angle * Math.PI / 180)));
        System.out.println(String.format("%.10f", cnt));
    }
}
