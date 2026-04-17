import java.util.Scanner;

public class ABC_071_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int x = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        a -= x;
        b -= x;

        if (a < b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}