import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = A / 10;
        B = A - B * 10;
        int C = (A - B) / 10;
        C = A - C * 10;
        int D = (A - C) / 10;
        D = A - D * 10;
        int E = (A - D) / 10;
        if (B == C || C == D || E == D) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}
