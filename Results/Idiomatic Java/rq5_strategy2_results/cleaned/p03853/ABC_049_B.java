import java.util.Scanner;

public class ABC_049_B {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        for (int i = 1; i <= h; i++) {
            String c = scanner.nextLine();
            System.out.println(c);
            System.out.println(c);
        }
    }
}