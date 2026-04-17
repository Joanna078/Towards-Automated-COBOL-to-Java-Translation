import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        String s = parts[0];
        String t = parts[1];

        // Read second line
        ln = scanner.nextLine();
        parts = ln.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // Read third line
        String u = scanner.nextLine();

        // Adjust A or B based on comparison
        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }

        // Format A and B as two-digit strings
        String ansA = String.format("%02d", a);
        String ansB = String.format("%02d", b);

        // Output the result
        System.out.println(ansA + " " + ansB);
    }
}