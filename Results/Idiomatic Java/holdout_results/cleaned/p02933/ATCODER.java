import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String indata = scanner.nextLine();
        String indata2 = scanner.nextLine();

        // Unstring and parse the first input
        String[] parts = indata.split("\\s+");
        int a1 = Integer.parseInt(parts[0]);

        // Check condition and display appropriate output
        if (a1 >= 3200) {
            System.out.println(indata2);
        } else {
            System.out.println("red");
        }

        scanner.close();
    }
}