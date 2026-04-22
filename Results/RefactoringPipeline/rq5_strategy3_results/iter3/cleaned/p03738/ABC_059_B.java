import java.util.Scanner;

public class ABC_059_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input strings A and B
        System.out.print("Enter string A: ");
        String A = scanner.nextLine();
        System.out.print("Enter string B: ");
        String B = scanner.nextLine();

        // Pad strings with zeros to length 101
        String strA = String.format("%-101s", A).replace(' ', '0');
        String strB = String.format("%-101s", B).replace(' ', '0');

        // Compare strA and strB
        if (strA.compareTo(strB) > 0) {
            System.out.println("GREATER");
        } else if (strA.compareTo(strB) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }

        scanner.close();
    }
}