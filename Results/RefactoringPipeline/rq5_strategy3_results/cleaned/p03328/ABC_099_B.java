import java.util.Scanner;

public class ABC_099_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] ab = new int[2];
        int cur = 0;
        int i = 0;

        for (int n = 0; n < 2; n++) {
            int j = cur;
            while (j < input.length() && input.charAt(j) != ' ') {
                j++;
            }
            if (j > cur) { // Ensure there is a valid number to parse
                ab[i] = Integer.parseInt(input.substring(cur, j));
            }
            cur = j + 1;
            i++;
        }

        int div = ab[1] - ab[0];
        int s = 0;

        for (int k = 1; k <= div; k++) {
            s += k;
        }

        int t = s - ab[1];
        System.out.printf("%011d%n", t);
    }
}