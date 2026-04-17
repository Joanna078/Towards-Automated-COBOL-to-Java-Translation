import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter exactly two numbers.");
            return;
        }

        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());

        int classA = getClass(a);
        int classB = getClass(b);

        if (classA == classB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int getClass(int number) {
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 1;
            case 4:
            case 6:
            case 9:
            case 11:
                return 2;
            case 2:
                return 3;
            default:
                throw new IllegalArgumentException("Invalid number: " + number);
        }
    }
}