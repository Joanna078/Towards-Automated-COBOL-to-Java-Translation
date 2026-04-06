```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the array to hold the data
        char[][] sO = new char[3][];
        for (int i = 0; i < 3; i++) {
            sO[i] = new char[3];
            for (int j = 0; j < 3; j++) {
                sO[i][j] = ' ';
            }
        }

        // Read input into the array
        System.out.println("Enter 9 characters:");
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                sO[i][j] = line.charAt(j);
            }
        }

        // Initialize variables
        int idx = 0;
        int wVal;
        int wShow;
        int rem;
        String ans = "No";
        int wA;
        int wB;

        // Perform the loop
        for (idx = 1; idx <= 3; idx++) {
            wA = sO[idx - 1][0];
            wB = sO[idx - 1][2];
            wVal = wA * wB * idx;
            wShow = wVal / 2;
            rem = wVal % 2;
            if (rem == 1) {
                ans = "Yes";
                break; // Exit the loop once a condition is met
            }
        }

        // Display the result
        System.out.println(ans);

        scanner.close();
    }
}
```