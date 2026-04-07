import java.util.Arrays;

public class ABC_042_A {
    public static void main(String[] args) {
        // Define the input string
        String inp = "123 456 789"; // Example input, replace with actual input handling

        // Initialize variables
        int maxlen = 3;
        int cur = 0; // Adjusted to start from index 0
        int i = 0; // Adjusted to start from index 0
        int j;
        int len;
        int[][] abc = new int[maxlen][2]; // Array to hold the parsed numbers
        int five = 0;
        int seven = 0;

        // Split the input string into tokens based on spaces
        String[] tokens = inp.split(" ");
        for (int k = 0; k < maxlen; k++) {
            abc[k] = Arrays.stream(tokens[k].split("")).mapToInt(Integer::parseInt).toArray();
        }

        // Process each token
        for (int k = 0; k < maxlen; k++) {
            j = cur;
            while (j < abc[k].length && abc[k][j] != 0) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                cur = j + 1;
                i++;
            }
        }

        // Count occurrences of 5 and 7
        for (i = 0; i < maxlen; i++) {
            for (int num : abc[i]) {
                if (num == 5) {
                    five++;
                } else if (num == 7) {
                    seven++;
                }
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