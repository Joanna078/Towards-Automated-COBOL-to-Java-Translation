import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int len = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
        if (len <= 18) {
            double x = Double.parseDouble(parts[0]);
            double y = 100;
            int i = 1;
            while (i <= 3760 && y < x) {
                y += y * 0.01;
                i++;
            }
            System.out.println(i - 1);
        } else {
            System.out.println(3760);
        }
    }
}