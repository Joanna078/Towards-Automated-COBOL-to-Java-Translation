import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split(" ");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);

        int r = a1 + (a2 / 2);
        String disp = String.format("%02d", r);

        System.out.println(disp);
    }
}