import java.util.Scanner;

public class NomuraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        int h1 = Integer.parseInt(parts[0]);
        int m1 = Integer.parseInt(parts[1]);
        int h2 = Integer.parseInt(parts[2]);
        int m2 = Integer.parseInt(parts[3]);
        int k = Integer.parseInt(parts[4]);

        int w = (h2 * 60 + m2) - (h1 * 60 + m1);
        int out = w - k;

        System.out.println(out);
    }
}