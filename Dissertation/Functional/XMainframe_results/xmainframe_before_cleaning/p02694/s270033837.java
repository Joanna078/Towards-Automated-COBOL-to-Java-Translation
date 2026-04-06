import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int len = Integer.parseInt(input.split(" ")[1]);
        if (len <= 18) {
            double y = 100;
            int i = 1;
            while (i < 3760 && y < Double.parseDouble(input.split(" ")[0])) {
                y += y * 0.01;
                i++;
            }
            System.out.println(i);
        } else {
            System.out.println(3760);
        }
    }
}