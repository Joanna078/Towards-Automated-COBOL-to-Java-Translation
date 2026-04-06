```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the array to hold the data
        char[] sO = new char[3];
        for (int i = 0; i < 3; i++) {
            sO[i] = ' ';
        }

        // Read input into the array
        System.out.println("Enter 3 characters:");
        String line = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            sO[i] = line.charAt(i);
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
            wA = Character.getNumericValue(sO[idx - 1]); // Use current index
            wB = Character.getNumericValue(sO[idx - 1]); // Use current index
            wVal = wA * wB * idx;
            wShow = wVal / 2;
            rem = wVal % 2;
            if (rem == 1) {
                ans = "Yes";
            }
        }

        // Display the result
        System.out.println(ans);

        scanner.close();
    }
}
```