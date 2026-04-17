import java.util.Scanner;

public class ABC_055_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int tmpN = n / 15;
        int tmp = 800 * n - tmpN * 200;
        String zs = String.format("%07d", tmp);
        String ans = zs.stripLeading();

        System.out.println(ans);
    }
}