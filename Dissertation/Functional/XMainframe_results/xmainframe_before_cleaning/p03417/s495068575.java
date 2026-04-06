import java.util.*;
public class Kyopuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inStr = scanner.nextLine();
        String[] nm = inStr.split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        if (n == 1 && m == 1) {
            System.out.println(1);
        } else if (n == 1 || m == 1) {
            System.out.println(Math.max(n, m) - 2);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}