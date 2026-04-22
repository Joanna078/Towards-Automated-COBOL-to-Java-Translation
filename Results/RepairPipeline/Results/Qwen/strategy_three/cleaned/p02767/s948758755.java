import java.util.Scanner;

public class ABeginner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input processing
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        String dtX1 = parts[0];
        int dtL1 = Integer.parseInt(parts[1]);
        int inN = Integer.parseInt(dtX1.substring(0, dtL1));
        
        inp = scanner.nextLine();
        int i = 0;
        int xp = 0;
        int p1 = 1;
        int[] inX = new int[inN];
        while (i < inN) {
            p1 = p1;
            while (p1 <= inp.length() && inp.charAt(p1 - 1) >= '0' && inp.charAt(p1 - 1) <= '9') {
                p1++;
            }
            if (p1 - 1 >= 0) {
                inX[i] = Integer.parseInt(inp.substring(p1 - i - 1, p1 - 1));
                xp += inX[i];
                i++;
            }
            p1++;
        }

        double avg = (double) xp / inN + 0.5;

        int xP2 = 0;
        for (i = 0; i < inN; i++) {
            xP2 += Math.pow(inX[i] - avg, 2);
        }

        System.out.printf("%06d%n", xP2);

        scanner.close();
    }
}