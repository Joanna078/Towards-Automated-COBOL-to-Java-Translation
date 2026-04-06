import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        int res = 0;

        // Split the input data into two parts based on space delimiter
        String[] parts = indata.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        // Perform division and get quotient and remainder
        int g = n / m;
        int d = n % m;

        // Add quotient to result
        res += g;

        // If there is a remainder, increment the result
        if (d > 0) {
            res++;
        }

        // Trim leading zeros from the result and display it
        System.out.printf("%04d%n", res);

        scanner.close();
    }
}