import java.util.Scanner;

public class ABC_105_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder str = new StringBuilder();

        while (n != 0) {
            if (n % 2 == 1) {
                n--;
                str.append('1');
            } else {
                str.append('0');
            }
            n /= -2;
        }

        String ans = str.reverse().toString();
        System.out.println(ans.isEmpty() ? "0" : ans);
    }
}