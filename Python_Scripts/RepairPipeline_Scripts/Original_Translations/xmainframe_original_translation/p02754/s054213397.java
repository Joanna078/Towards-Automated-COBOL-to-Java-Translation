import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        long n = Long.parseLong(arr[0]);
        long a = Long.parseLong(arr[1]);
        long b = Long.parseLong(arr[2]);
        if (a == 0) {
            System.out.println(0);
        } else if (b == 0) {
            System.out.println(n);
        } else {
            long cnt = n / (a + b);
            long sumA = a * cnt;
            long sumB = b * cnt;
            while (n > sumA + sumB) {
                sumA += a;
                sumB += b;
            }
            long diff = sumA + sumB - n;
            if (diff <= b) {
                System.out.println(sumA);
            } else {
                System.out.println(sumA - (diff - b));
            }
        }
    }
}
