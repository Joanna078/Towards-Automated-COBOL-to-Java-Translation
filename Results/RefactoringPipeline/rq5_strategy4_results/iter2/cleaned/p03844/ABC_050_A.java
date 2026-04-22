import java.util.Scanner;

public class ABC_050_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        long A = Long.parseLong(parts[0]);
        char op = parts[1].charAt(0);
        long B = Long.parseLong(parts[2]);

        long result;
        if (op == '+') {
            result = A + B;
        } else {
            result = A - B;
        }

        System.out.println(result);
    }
}