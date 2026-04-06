import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        long x = Long.parseLong(arr[0]);
        long k = Long.parseLong(arr[1]);
        long d = Long.parseLong(arr[2]);
        long wx = Math.abs(x);
        long s = wx / d;
        long r = wx % d;
        long za;
        if (s > 0) {
            if (x > 0) {
                if (s > k) {
                    za = x - k * d;
                    k = 0;
                } else {
                    za = x - s * d;
                    k = k - s;
                }
            } else {
                if (s > k) {
                    za = x + k * d;
                    k = 0;
                } else {
                    za = x + s * d;
                    k = k - s;
                }
            }
        } else {
            za = x;
        }
        if (k > 0) {
            s = k / 2;
            r = k % 2;
            if (r == 0) {
                System.out.printf("%016d%n", za);
            } else {
                if (za > 0) {
                    System.out.printf("%016d%n", za - d);
                } else {
                    System.out.printf("%016d%n", za + d);
                }
            }
        } else {
            System.out.printf("%016d%n", za);
        }
    }
}