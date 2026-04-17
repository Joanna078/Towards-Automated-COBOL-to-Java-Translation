import java.util.Scanner;

public class ABC_083_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);

        int sum1 = a + b;
        int sum2 = c + d;

        if (sum1 < sum2) {
            System.out.println("Right");
        } else if (sum1 == sum2) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}