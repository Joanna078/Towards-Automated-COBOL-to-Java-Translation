import java.util.Scanner;

public class ABC_056_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input. Please enter exactly three numbers.");
            return;
        }

        int w = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        if (b < a) {
            int temp = b;
            b = a;
            a = temp;
        }

        a += w;

        if (b < a) {
            System.out.println("0");
        } else {
            int result = b - a;
            System.out.println(result);
        }
    }
}