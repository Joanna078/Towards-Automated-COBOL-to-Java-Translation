```java
import java.util.Scanner;

public class SortNum {

    private int returnCode;
    private char x;

    public static void main(String[] args) {
        SortNum sortNum = new SortNum();
        sortNum.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = scanner.next().charAt(0);
        scanner.close();

        if (x == '0') {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```