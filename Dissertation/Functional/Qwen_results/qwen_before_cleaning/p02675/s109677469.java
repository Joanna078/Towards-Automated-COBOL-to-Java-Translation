import java.util.Scanner;

public class PracticeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from standard input
        int work = scanner.nextInt();
        
        // Extract digits using redefinition
        int workRA = work / 10;
        int workRB = work % 10;
        
        // Evaluate and display based on the last digit
        switch (workRB) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                System.out.println("hon");
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                break;
            case 3:
                System.out.println("bon");
                break;
            default:
                // Handle unexpected cases if any
                System.out.println("Unexpected value: " + workRB);
                break;
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **Redefinition**: Used integer division and modulus operations to extract the digits as required.
3. **Evaluation**: Replaced `EVALUATE` with `switch` statement for better readability and Java 17 support.
4. **Code Quality**: Added comments for clarity and used Java 17 features where applicable.