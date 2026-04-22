import java.util.Scanner;

public class Crackers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int inN = Integer.parseInt(parts[0]);
        int inK = Integer.parseInt(parts[1]);

        int maisu = inN / inK;
        int amari = inN % inK;

        if (amari == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}