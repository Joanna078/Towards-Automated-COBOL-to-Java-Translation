import java.util.Scanner;

public class ABC_056_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int w = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        if (b < a) {
            int temp = b;
            b = a;
            a = temp;
        }

        a += w;

        if (b < a) {
            System.out.println(0);
        } else {
            int result = b - a;
            String zs = String.format("%06d", result);
            String ans = zs.replaceAll("\\s+", "");
            System.out.println(ans);
        }
    }
}