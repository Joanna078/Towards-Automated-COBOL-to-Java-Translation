import java.util.Scanner;

public class ABC_075_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);

        int ZS;
        if (A == B) {
            ZS = C;
        } else if (B == C) {
            ZS = A;
        } else {
            ZS = B;
        }

        String ans = String.valueOf(ZS);
        System.out.println(ans);
    }
}