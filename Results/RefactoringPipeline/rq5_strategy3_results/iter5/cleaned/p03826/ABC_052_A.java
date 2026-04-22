import java.util.Scanner;

public class ABC_052_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        String[] parts = inp.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        long B = Long.parseLong(parts[1]);
        int C = Integer.parseInt(parts[2]);
        long D = Long.parseLong(parts[3]);

        long productAB = A * B;
        long productCD = C * D;

        long maxProduct = Math.max(productAB, productCD);

        String ans = String.format("%07d", maxProduct).substring(1);

        System.out.println(ans.stripLeading());
    }
}