import java.util.Scanner;

public class Main {

    private int returnCode = 0;
    private String s = "";
    private int i = 0;
    private int cnt = 0;
    private int max = 0;
    private int out = 0;
    private char c = ' ';

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = scanner.nextLine();
        scanner.close();

        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }

        out = max;
        System.out.println("Longest sequence of A, C, G, T: " + out);
    }
}