import java.util.Scanner;

public class Christmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        switch (num) {
            case 25 -> System.out.println("Christmas");
            case 24 -> System.out.println("Christmas Eve");
            case 23 -> System.out.println("Christmas Eve Eve");
            case 22 -> System.out.println("Christmas Eve Eve Eve");
            default -> System.out.println("No specific message for this number.");
        }
    }
}