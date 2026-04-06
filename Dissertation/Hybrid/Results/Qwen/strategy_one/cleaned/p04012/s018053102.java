import java.util.Arrays;

public class ABC_044_A {
    public static void main(String[] args) {
        // Working storage variables
        char[] a = new char[1];
        char[] anum = {'a'};
        char[] chr = new char[1];
        char[] w = new char[100];
        int len;
        int i;
        int[] cnt1 = new int[26];
        int tmp;
        char flg = '0';

        // Accept input
        System.arraycopy(args[0].toCharArray(), 0, w, 0, Math.min(args[0].length(), 100));

        // Compute length of input string
        len = args[0].length();

        // Initialize character array a with 'a'
        a[0] = 'a';

        // Count occurrences of each character
        for (i = 0; i < len; i++) {
            chr[0] = w[i];
            if (chr[0] >= 'a' && chr[0] <= 'z') {
                cnt1[(int) chr[0] - (int) anum[0]]++;
            }
        }

        // Check if any count is odd
        for (i = 0; i < 26; i++) {
            tmp = cnt1[i] % 2;
            if (tmp > 0) {
                flg = '1';
                break;
            }
        }

        // Display result
        if (flg == '0') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}