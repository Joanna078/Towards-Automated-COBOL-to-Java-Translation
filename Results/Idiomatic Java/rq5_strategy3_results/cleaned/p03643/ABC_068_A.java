import java.util.Scanner;

public class ABC_068_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine().substring(0, 3);
        scanner.close();

        System.out.println("ABC" + n);
    }
}