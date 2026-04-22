import java.util.Scanner;

public class ABC043_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int ans = n * (n + 1) / 2;
        System.out.println(ans);
    }
}