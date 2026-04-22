import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define the input string
        String inp = "HelloWorld"; // Replace with actual input

        // Convert input string to character array
        char[] wkTbl = new char[100];
        System.arraycopy(inp.toCharArray(), 0, wkTbl, 0, Math.min(inp.length(), 100));

        // Initialize index variables
        int idx = 0;
        int idx2 = 0;
        int idx3 = 0;

        // Find the first space in the array
        while (idx < wkTbl.length && wkTbl[idx] != ' ') {
            idx++;
        }

        // Calculate idx2 and idx3
        idx2 = idx - 1;
        idx3 = idx - 3;

        // Display the result
        if (idx3 >= 0) {
            System.out.print(wkTbl[0]);
            for (int i = idx3; i <= idx2; i++) {
                System.out.print(wkTbl[i]);
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }
}