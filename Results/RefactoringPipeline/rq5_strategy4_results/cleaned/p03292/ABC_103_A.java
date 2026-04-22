import java.util.Scanner;

public class ABC_103_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        int maxlen = 3;
        int cur = 0;
        int[] A = new int[maxlen];
        int len;
        int sm = 0;

        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                A[n] = Integer.parseInt(inp.substring(cur, j));
            }
            cur = j + 1;
        }

        for (int i = 0; i < maxlen; i++) {
            for (int j = i + 1; j < maxlen; j++) {
                if (A[j] < A[i]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        sm = Math.abs(A[1] - A[0]) + Math.abs(A[2] - A[1]);

        System.out.println(sm);
    }
}