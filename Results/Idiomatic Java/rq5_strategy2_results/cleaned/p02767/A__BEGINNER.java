import java.util.Scanner;

public class ABEGINNER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String inp = scanner.nextLine();
        String dtX1 = inp.trim();
        int inN = dtX1.length();

        // Read second line
        inp = scanner.nextLine();
        int[] inX = new int[100];
        int i = 0;
        int p1 = 0;
        int xp = 0;

        while (i < inN) {
            int p2 = p1;
            while (p1 < inp.length() && Character.isDigit(inp.charAt(p1))) {
                p1++;
            }
            if (p1 > p2) {
                inX[i] = Integer.parseInt(inp.substring(p2, p1));
                xp += inX[i];
                i++;
            }
            p1++;
        }

        double avg = (double) xp / inN;
        long xP2 = 0;

        for (int j = 0; j < inN; j++) {
            xP2 += Math.pow(inX[j] - avg, 2);
        }

        System.out.printf("%07d%n", xP2);
    }
}