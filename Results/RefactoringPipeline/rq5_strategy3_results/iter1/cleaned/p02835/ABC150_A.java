import java.util.Scanner;

public class ABC150_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] parts = inputLine.split("\\s+");
        long a1 = Long.parseLong(parts[0]);
        long a2 = Long.parseLong(parts[1]);
        long a3 = Long.parseLong(parts[2]);

        long sum = a1 + a2 + a3;
        if (sum <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}