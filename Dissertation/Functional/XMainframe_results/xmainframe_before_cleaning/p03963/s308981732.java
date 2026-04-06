import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] parts = str.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        long ans = k * (long) Math.pow(k - 1, n - 1);
        System.out.println(String.format("%d", ans));
    }
}