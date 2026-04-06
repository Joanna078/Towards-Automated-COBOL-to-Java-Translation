import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        String indata = scanner.nextLine();
        String indata2 = scanner.nextLine();

        // Convert input to integer
        int a1 = Integer.parseInt(indata.trim());

        // Logic processing
        if (a1 >= 3200) {
            System.out.println(indata2);
        } else {
            System.out.println("red");
        }

        scanner.close();
    }
}