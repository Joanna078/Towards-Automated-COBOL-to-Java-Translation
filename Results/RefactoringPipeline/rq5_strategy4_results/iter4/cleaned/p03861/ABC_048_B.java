import java.util.Scanner;

public class ABC_048_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        long a = Long.parseLong(parts[0]);
        long b = Long.parseLong(parts[1]);
        long x = Long.parseLong(parts[2]);

        long q1 = x / a;
        long r = x % a;
        long q2 = x / b;

        if (r == 0) {
            q2++;
        }

        System.out.println(q2);
    }
}