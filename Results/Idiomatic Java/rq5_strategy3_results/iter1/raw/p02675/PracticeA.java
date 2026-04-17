```java
import java.util.Scanner;

public class PracticeA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int work = scanner.nextInt();
        scanner.close();

        int workRB = work % 10;

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
                System.out.println("Invalid input");
        }
    }
}
```