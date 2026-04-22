import java.util.Scanner;

public class ABC_097_B {

    private static final int MAXLEN = 4;
    private static final int INPUT_LENGTH = 16;
    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine().substring(0, INPUT_LENGTH);

        int[] abcd = new int[ARRAY_SIZE];
        int cur = 0;
        int i = 0;

        while (i < MAXLEN) {
            int j = cur;
            while (j < INPUT_LENGTH && input.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abcd[i] = Integer.parseInt(input.substring(cur, cur + len));
            }
            cur = j + 1;
            i++;
        }

        if ((abcd[0] - abcd[2] <= abcd[3]) ||
            (abcd[0] - abcd[1] <= abcd[3] && abcd[1] - abcd[2] <= abcd[3])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}