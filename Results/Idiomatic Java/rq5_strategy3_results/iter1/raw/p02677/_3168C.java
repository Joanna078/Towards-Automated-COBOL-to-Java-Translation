```java
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for A, B, H, M separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        if (parts.length != 4) {
            System.out.println("Please enter exactly four values.");
            return;
        }

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int H = Integer.parseInt(parts[2]);
        int M = Integer.parseInt(parts[3]);

        double AK = H * 30 + M * 0.5;
        double BK = M * 6;
        double SK = AK - BK;

        if (SK > 180) {
            SK = 360 - SK;
        }

        double CNT;
        switch ((int) SK) {
            case 0:
                CNT = A - B;
                break;
            case 90:
                CNT = Math.sqrt(A * A + B * B);
                break;
            case 180:
                CNT = A + B;
                break;
            default:
                double RAD = Math.cos(Math.toRadians(SK));
                CNT = Math.sqrt(A * A + B * B - 2 * A * B * RAD);
                break;
        }

        String formattedOutput = String.format("%04d.%010d", (int) CNT, (int) ((CNT - (int) CNT) * Math.pow(10, 10)));
        System.out.println(formattedOutput);
    }
}
```