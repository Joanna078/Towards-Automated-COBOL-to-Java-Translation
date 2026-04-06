import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split(" ");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);

        int g = a2 / a1;
        int r = a2 % a1;
        int a3;

        if (r > 0) {
            a3 = a2 - a1;
        } else {
            a3 = a2 + a1;
        }

        System.out.printf("%02d%n", Math.abs(a3));
    }
}