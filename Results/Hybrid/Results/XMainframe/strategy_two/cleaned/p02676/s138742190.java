import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over
        String s = scanner.nextLine();
        int len = s.split(" ").length;
        if (len <= k) {
            System.out.println(s.trim());
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
    }
}