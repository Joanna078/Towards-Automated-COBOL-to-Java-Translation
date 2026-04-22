import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
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

            String ans = zz + " " + zx + " " + zy;
            System.out.println(ans.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}