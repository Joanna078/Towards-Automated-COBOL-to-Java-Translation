```java
import java.util.Scanner;

public class PracticeA {

    private int returnCode;
    private String work;
    private boolean initialized;

    public static void main(String[] args) {
        PracticeA practiceA = new PracticeA();
        practiceA.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        work = scanner.nextLine();
        scanner.close();

        if (!initialized) {
            initialized = true;
        }

        switch (work) {
            case "1":
            case "2":
            case "4":
            case "5":
            case "7":
            case "9":
                System.out.println("hon");
                break;
            case "0":
            case "6":
            case "8":
                System.out.println("pon");
                break;
            case "3":
                System.out.println("bon");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
```