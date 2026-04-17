import java.util.Scanner;

public class A_DoubleHelix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char b = scanner.next().charAt(0);
        scanner.close();

        String enki = "ACGT";
        int i = 0;

        while (i < enki.length() && b != enki.charAt(i)) {
            i++;
        }

        if (i < enki.length()) {
            System.out.println(enki.charAt(3 - i));
        }
    }
}