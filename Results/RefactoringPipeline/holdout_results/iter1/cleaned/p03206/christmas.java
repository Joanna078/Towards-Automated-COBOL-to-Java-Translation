import java.util.Scanner;

public class Christmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        switch (num) {
            case 25:
                System.out.println("Christmas");
                break;
            case 24:
                System.out.println("Christmas Eve");
                break;
            case 23:
                System.out.println("Christmas Eve Eve");
                break;
            case 22:
                System.out.println("Christmas Eve Eve Eve");
                break;
            default:
                System.out.println("No specific message for this number.");
                break;
        }
    }
}