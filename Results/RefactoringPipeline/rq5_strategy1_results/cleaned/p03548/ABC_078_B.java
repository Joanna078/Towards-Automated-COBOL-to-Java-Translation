import java.util.Scanner;

public class ABC_078_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private int d = 0;
    private int r = 0;
    private String ans = "";

    public static void main(String[] args) {
        ABC_078_B program = new ABC_078_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 3) {
            x = Integer.parseInt(parts[0]);
            y = Integer.parseInt(parts[1]);
            z = Integer.parseInt(parts[2]);
        } else {
            System.out.println("Invalid input. Please enter three numbers separated by spaces.");
            return;
        }

        x -= z;
        z += y;
        d = x / z;
        r = x % z;
        ans = String.valueOf(d);

        System.out.println("Result: " + ans);
    }
}