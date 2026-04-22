import java.util.Scanner;

public class ALREADY {

    private static final int LENGTH_OF_S = 10;
    private static final String YEAR_TO_MOVE = "2018";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = new char[LENGTH_OF_S];

        // ACCEPT S
        System.out.print("Enter a value for S: ");
        String input = scanner.nextLine();
        if (input.length() > LENGTH_OF_S) {
            input = input.substring(0, LENGTH_OF_S);
        }
        input.getChars(0, input.length(), s, 0);

        // MOVE "2018" TO S(1:4)
        System.arraycopy(YEAR_TO_MOVE.toCharArray(), 0, s, 0, 4);

        // DISPLAY S
        System.out.println(new String(s));

        scanner.close();
    }
}