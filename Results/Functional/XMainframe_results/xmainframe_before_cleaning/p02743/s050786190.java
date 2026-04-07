import java.util.Scanner;
public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);
        double left = Math.sqrt(a);
        double right = Math.sqrt(b);
        double total = left + right;
        if (total < Math.sqrt(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}