import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private int a;
    private int b;
    private int wa;
    private int x;
    private int xx;
    private int ama;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() > 0) {
            String[] parts = inp.split("\\s+");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);

            wa = a + b;
            x = wa / 2;
            ama = wa % 2;

            if (ama != 0) {
                x++;
            }

            xx = x;
            System.out.println("Result: " + xx);
        } else {
            System.out.println("No input provided.");
        }
    }
}