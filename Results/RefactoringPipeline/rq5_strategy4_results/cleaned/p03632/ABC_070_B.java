import java.util.Scanner;

public class ABC_070_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);

        int mx = Math.max(a, c);
        int mn = Math.min(b, d);

        if (mx < mn) {
            mn -= mx;
        } else {
            mn = 0;
        }

        String zs = String.format("%03d", mn);
        String ans = zs.substring(1);

        System.out.println(ans);
    }
}