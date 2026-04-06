import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        long ab = (long)a * b;
        long cd = (long)c * d;
        long max = Math.max(ab, cd);
        String zs = String.format("%08d", max);
        String ans = zs.substring(1);
        System.out.println(ans.trim());
    }
}