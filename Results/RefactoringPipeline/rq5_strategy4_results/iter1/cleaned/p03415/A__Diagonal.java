import java.util.Scanner;

public class ADiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter C1: ");
        String c1 = scanner.nextLine();

        System.out.print("Enter C2: ");
        String c2 = scanner.nextLine();

        System.out.print("Enter C3: ");
        String c3 = scanner.nextLine();

        char resultChar1 = c1.charAt(0);
        char resultChar2 = c2.charAt(1);
        char resultChar3 = c3.charAt(2);

        System.out.println(resultChar1 + "" + resultChar2 + "" + resultChar3);

        scanner.close();
    }
}