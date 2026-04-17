import java.util.Scanner;

public class ABC_080_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);

        int T = (a * N <= b) ? a * N : b;
        String ans = String.format("%04d", T).stripLeading();

        System.out.println(ans);
    }
}