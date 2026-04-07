import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        String[] inputs = ln.split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int D = Integer.parseInt(inputs[3]);
        int TK = (C + B - 1) / B;
        int AO = (A + D - 1) / D;
        if (TK <= AO) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}