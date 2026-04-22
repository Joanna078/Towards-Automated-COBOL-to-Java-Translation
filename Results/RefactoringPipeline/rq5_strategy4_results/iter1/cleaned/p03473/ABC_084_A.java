import java.util.Scanner;

public class ABC_084_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m = scanner.nextInt();
        scanner.close();

        m = 48 - m;
        System.out.println(m);
    }
}