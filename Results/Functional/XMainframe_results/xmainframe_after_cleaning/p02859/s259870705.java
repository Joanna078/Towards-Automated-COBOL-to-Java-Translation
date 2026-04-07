import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int r = Integer.parseInt(inp);
        long ans = (long) r * r;
        System.out.println(String.format("%d", ans));
    }
}
