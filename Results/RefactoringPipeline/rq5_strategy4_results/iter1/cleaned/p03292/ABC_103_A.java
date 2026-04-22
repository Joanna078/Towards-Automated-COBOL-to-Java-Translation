import java.util.Scanner;

public class ABC_103_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        int maxlen = 3;
        int cur = 0;
        int i = 0;
        int[] A = new int[3];
        int len;
        int sm = 0;

        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                A[i] = Integer.parseInt(inp.substring(cur, j).trim());
                i++;
            }
            cur = j + 1;
        }

        for (i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (A[j] < A[i]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        sm = Math.abs(A[1] - A[0]) + Math.abs(A[2] - A[1]);

        String ans = String.format("%04d", sm);
        System.out.println(ans.substring(1)); // Remove leading zero
    }
}