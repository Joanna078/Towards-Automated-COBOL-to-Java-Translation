import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        long a1 = Long.parseLong(parts[0]);
        long a2 = Long.parseLong(parts[1]);
        long a3 = Long.parseLong(parts[2]);

        long r = a2 / a1;

        if (r >= a3) {
            System.out.printf("%08d%n", a3);
        } else {
            System.out.printf("%08d%n", r);
        }
    }
}