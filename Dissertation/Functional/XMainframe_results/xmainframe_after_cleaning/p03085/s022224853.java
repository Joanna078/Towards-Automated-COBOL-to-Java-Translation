import java.util.Scanner;

public class A_DoubleHelix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        int i;
        for (i = 1; i <= 4; i++) {
            if (b.equals("ACGT".substring(i - 1, i))) {
                break;
            }
        }

        System.out.println("ACGT".substring(4 - i, 5 - i));
    }
}
