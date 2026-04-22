import java.util.Scanner;

public class ABC_049_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT INP
        String inp = scanner.nextLine();

        // UNSTRING INP DELIMITED BY SPACE INTO H W
        String[] parts = inp.split("\\s+");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        // PERFORM VARYING i FROM 1 BY 1 UNTIL H < i
        for (int i = 1; i <= h; i++) {
            // ACCEPT C
            String c = scanner.nextLine();

            // DISPLAY C(1:FUNCTION STORED-CHAR-LENGTH(C))
            System.out.println(c.substring(0, c.length()));

            // DISPLAY C(1:FUNCTION STORED-CHAR-LENGTH(C))
            System.out.println(c.substring(0, c.length()));
        }

        scanner.close();
    }
}