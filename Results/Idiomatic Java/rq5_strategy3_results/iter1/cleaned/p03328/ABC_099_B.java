import java.util.Scanner;

public class ABC_099_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] ab = new int[2];
        int cur = 1;
        int i = 1;

        for (int n = 0; n < 2; n++) {
            int j = cur;
            while (j < input.length() && input.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            ab[i - 1] = Integer.parseInt(input.substring(cur - 1, cur - 1 + len));
            cur = j + 1;
            i++;
        }

        int div = ab[1] - ab[0];
        int s = 0;

        for (int k = 0; k < div; k++) {
            s += k + 1;
        }

        int t = s - ab[1];
        System.out.printf("%011d%n", t);
    }
}