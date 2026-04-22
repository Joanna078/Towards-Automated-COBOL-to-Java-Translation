import java.util.Scanner;

public class ABC_057_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        a += b;
        if (a >= 24) {
            a -= 24;
        }

        String ans = String.format("%02d", a).substring(1);

        System.out.println(ans);
    }
}