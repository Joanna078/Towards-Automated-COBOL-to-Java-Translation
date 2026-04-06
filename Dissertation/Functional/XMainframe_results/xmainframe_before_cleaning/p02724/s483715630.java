import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int s1 = x / 500;
        int a = x % 500;
        int s2 = a / 5;
        int out = s1 * 1000 + s2 * 5;
        System.out.println(out);
    }
}