import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = N;
        int remainder = D % 10;
        int count = 1;
        while (D != 0) {
            D /= 10;
            if (D % 10 == remainder) {
                count++;
            }
        }
        System.out.println(count >= 3 ? "Yes" : "No");
    }
}