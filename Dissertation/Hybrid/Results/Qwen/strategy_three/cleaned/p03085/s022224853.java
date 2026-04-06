import java.util.Scanner;

public class ADoubleHelix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a character: ");
        char b = scanner.next().charAt(0);

        // Constants
        final String enki = "ACGT";
        int i = 0;

        // Logic
        while ((i < 4) && (b != enki.charAt(i))) {
            i++;
        }

        // Output
        if (i < 4) {
            System.out.println(enki.charAt(4 - i));
        } else {
            System.out.println("Character not found in ACGT");
        }
    }
}