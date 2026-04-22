import java.util.Scanner;

public class ABC_053_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();

        if (x < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}