import java.util.Scanner;

public class A_DoubleHelix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char b = scanner.next().charAt(0);
        scanner.close();

        String enki = "ACGT";

        for (int i = 0; i < enki.length(); i++) {
            if (b == enki.charAt(i)) {
                System.out.println(enki.charAt(3 - i));
                return;
            }
        }
    }
}