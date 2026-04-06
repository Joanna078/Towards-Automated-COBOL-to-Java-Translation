import java.util.*;
public class Crackers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);
        int remainder = N % K;
        if (remainder == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}