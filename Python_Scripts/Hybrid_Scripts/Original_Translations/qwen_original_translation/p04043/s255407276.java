import java.util.Arrays;

public class ABC_042_A {
    public static void main(String[] args) {
        // Define the input string
        String inp = "123 456 789"; // Example input, replace with actual input handling

        // Initialize variables
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        char[] ans = new char[8];
        int five = 0;
        int seven = 0;

        // Split the input string into tokens based on spaces
        String[] tokens = inp.split(" ");
        int[] abc = Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();

        // Process each token
        while (i <= maxlen) {
            j = cur;
            while (j < abc.length && abc[j] != 0) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                System.arraycopy(abc, cur - 1, ans, i - 1, len);
                cur = j + 1;
                i++;
            }
        }

        // Count occurrences of 5 and 7
        for (; i <= 3; i++) {
            if (abc[i - 1] == 5) {
                five++;
            } else if (abc[i - 1] == 7) {
                seven++;
            }
        }

        // Check conditions and display result
        if (five == 2 && seven == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}