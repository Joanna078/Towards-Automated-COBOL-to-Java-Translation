```java
import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String inp = scanner.nextLine();
        
        int temp1 = 0;
        
        // Find the first space character
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        
        // Extract substring before the first space
        String a = inp.substring(0, temp1);
        
        // Move past the space
        temp1 += 2;
        
        int temp2 = temp1;
        
        // Find the next space character
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        
        // Calculate the length of the second substring
        int n = temp2 - temp1;
        
        // Extract the second substring
        String b = inp.substring(temp1, temp2);
        
        // Convert the first character of b to lowercase if it is uppercase
        if (b.length() > 0) {
            char firstChar = b.charAt(0);
            if (firstChar == 'A') {
                b = 'a' + b.substring(1);
            } else if (firstChar == 'B') {
                b = 'b' + b.substring(1);
            } else if (firstChar == 'C') {
                b = 'c' + b.substring(1);
            }
        }
        
        // Display the modified string
        System.out.println(inp);
        
        scanner.close();
    }
}
```