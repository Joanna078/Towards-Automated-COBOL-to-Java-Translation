import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();

        if (x == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}