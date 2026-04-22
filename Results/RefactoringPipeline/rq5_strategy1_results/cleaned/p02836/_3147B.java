import java.util.Scanner;

public class Main {

    private int returnCode;
    private String inp;
    private String s;
    private String n;
    private int h;
    private int i;
    private int j;
    private int outH;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        unstring(inp);
        h = 0;
        i = 1;
        j = Integer.parseInt(n);

        while (i <= j) {
            if (s.charAt(i - 1) != s.charAt(j - 1)) {
                h += 2;
            }
            i++;
            j--;
        }

        outH = h;
        System.out.println("Output: " + outH);
    }

    private void unstring(String input) {
        String[] parts = input.split(" ");
        s = parts[0];
        n = parts[1];
    }
}