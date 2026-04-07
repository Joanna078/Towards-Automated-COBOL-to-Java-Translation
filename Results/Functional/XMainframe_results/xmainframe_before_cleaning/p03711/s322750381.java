import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        int classA = getClassification(a);
        int classB = getClassification(b);

        if (classA == classB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int getClassification(int number) {
        switch (number) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 1;
            }
            case 4, 6, 9, 11 -> {
                return 2;
            }
            case 2 -> {
                return 3;
            }
            default -> {
                throw new IllegalArgumentException("Invalid number: " + number);
            }
        }
    }
}