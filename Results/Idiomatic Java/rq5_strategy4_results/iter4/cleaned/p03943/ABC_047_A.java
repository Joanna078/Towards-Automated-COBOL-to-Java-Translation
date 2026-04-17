import java.util.Scanner;

public class ABC_047_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            System.out.println("No");
            return;
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        int x = a + b + c;
        int q = x / 2;
        int r = x % 2;

        if (r == 0 && (a == q || b == q || c == q)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}