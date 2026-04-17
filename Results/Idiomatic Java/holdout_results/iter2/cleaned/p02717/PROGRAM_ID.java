import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();

        String[] parts = ln.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Please enter exactly three numbers.");
            return;
        }

        try {
            long x = Long.parseLong(parts[0].trim());
            long y = Long.parseLong(parts[1].trim());
            long z = Long.parseLong(parts[2].trim());

            String zx = String.format("%,d", x);
            String zy = String.format("%,d", y);
            String zz = String.format("%,d", z);

            System.out.println(zz + " " + zx + " " + zy);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}