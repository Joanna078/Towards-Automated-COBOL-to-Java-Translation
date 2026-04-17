import java.util.Scanner;

public class ABC_065_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\s+");
        int x = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        b -= a;

        if (b <= 0) {
            System.out.println("delicious");
        } else if (b <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}