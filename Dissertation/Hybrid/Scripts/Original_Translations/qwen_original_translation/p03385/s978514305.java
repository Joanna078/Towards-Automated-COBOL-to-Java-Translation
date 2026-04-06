import java.util.Arrays;

public class ABC_093_A {
    public static void main(String[] args) {
        // Input string
        String inp = "abc"; // This should be replaced with actual input handling

        // Initialize variables
        int maxlen = 3;
        int cur = 0;
        int[] abc = new int[3];

        // Process each character in the input string
        while (cur < maxlen && cur < inp.length()) {
            char currentChar = inp.charAt(cur);
            if (currentChar == 'a') {
                abc[0] = 1;
            } else if (currentChar == 'b') {
                abc[1] = 1;
            } else if (currentChar == 'c') {
                abc[2] = 1;
            }
            cur++;
        }

        // Check if all characters were found
        if (Arrays.equals(abc, new int[]{1, 1, 1})) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}