import java.util.Scanner;

public class ABC_089_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int tmp = n / 3;
        String zs = String.format("%03d", tmp);
        String ans = zs.substring(1);

        System.out.println(ans.trim());
    }
}