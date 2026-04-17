import java.util.Scanner;

public class ABC_065_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        long x = Long.parseLong(parts[0]);
        long a = Long.parseLong(parts[1]);
        long b = Long.parseLong(parts[2]);

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