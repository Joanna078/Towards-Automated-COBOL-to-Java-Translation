import java.util.Scanner;

public class ABC_059_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string A: ");
        String A = scanner.nextLine();

        System.out.print("Enter string B: ");
        String B = scanner.nextLine();

        int num = 101;
        int numA = num - A.length();
        int numB = num - B.length();

        StringBuilder strA = new StringBuilder();
        for (int i = 0; i < numA; i++) {
            strA.append('0');
        }
        strA.append(A);

        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < numB; i++) {
            strB.append('0');
        }
        strB.append(B);

        int comparison = strA.toString().compareTo(strB.toString());

        if (comparison > 0) {
            System.out.println("GREATER");
        } else if (comparison < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }

        scanner.close();
    }
}