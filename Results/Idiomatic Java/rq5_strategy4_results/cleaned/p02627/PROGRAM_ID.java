import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        scanner.close();

        if (a <= 'Z') {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}