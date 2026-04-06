import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] parts = ln.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int ans = Math.max(A + B, Math.max(A - B, A * B));
        System.out.printf("%010d%n", ans);
    }
}