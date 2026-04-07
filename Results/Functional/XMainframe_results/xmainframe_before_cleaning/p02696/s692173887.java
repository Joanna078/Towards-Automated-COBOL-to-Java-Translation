import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int n = Integer.parseInt(arr[2]);
        int x;
        if (n >= b) {
            x = b - 1;
        } else {
            x = n;
        }
        long fa = ((long)a * (long)x) / (long)b;
        long fb = (long)x / (long)b;
        fb = a * fb;
        long out = fa - fb;
        System.out.println(out);
    }
}