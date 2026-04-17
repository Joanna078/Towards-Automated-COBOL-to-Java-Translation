import java.util.Scanner;

public class ABEGINNER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        int inN = Integer.parseInt(scanner.nextLine().trim());

        // Read second line
        String inp = scanner.nextLine();
        int[] inX = new int[inN];
        int xp = 0;
        int p1 = 0;
        int i = 0;

        while (i < inN) {
            while (p1 < inp.length() && !Character.isDigit(inp.charAt(p1))) {
                p1++;
            }
            int p2 = p1;
            while (p1 < inp.length() && Character.isDigit(inp.charAt(p1))) {
                p1++;
            }
            if (p1 > p2) {
                inX[i] = Integer.parseInt(inp.substring(p2, p1));
                xp += inX[i];
                i++;
            }
        }

        double avg = (double) xp / inN;
        double xP2 = 0;

        for (int value : inX) {
            xP2 += Math.pow(value - avg, 2);
        }

        System.out.printf("%d%n", (int) xP2);
    }
}