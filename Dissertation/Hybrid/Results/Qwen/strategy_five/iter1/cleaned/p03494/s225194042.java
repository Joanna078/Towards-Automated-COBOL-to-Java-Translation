import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] aRec = new int[200];
        String inp = "";
        int temp1, temp2, temp3;
        int n;
        int ren = 0;
        int re = 10000;
        int mod;
        int r;
        int s;
        int now = 1;

        // Read input values
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        inp = scanner.nextLine();

        // Process the input string
        for (s = 1; s <= n; s++) {
            for (temp1 = now; temp1 <= inp.length(); temp1++) {
                if (temp1 == inp.length() || inp.charAt(temp1 - 1) == ' ') break;
            }
            temp2 = temp1 - now;
            aRec[s - 1] = Integer.parseInt(inp.substring(now - 1, temp1));
            now = temp1 + 1;
        }

        // Perform calculations
        for (s = 1; s <= n; s++) {
            r = aRec[s - 1] / 2;
            mod = aRec[s - 1] - r * 2;
            while (mod != 1) {
                r = aRec[s - 1] / 2;
                mod = aRec[s - 1] - r * 2;
                aRec[s - 1] = r;
            }
            temp3 = mod > 0 ? 1 : 0;
            if (temp3 < re) {
                re = temp3;
            }
        }

        // Output the result
        ren = re;
        System.out.println(ren);
        scanner.close();
    }
}