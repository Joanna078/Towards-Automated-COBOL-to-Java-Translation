import java.util.Scanner;

public class ABC_079_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long lucas = calculateLucasNumber(n);

        String zs = String.format("%018d", lucas).replace(' ', '0');

        String[] parts = zs.split("");
        StringBuilder ans = new StringBuilder();
        for (String part : parts) {
            if (!part.equals("0")) {
                ans.append(part);
            }
        }

        System.out.println(ans.toString());
    }

    private static long calculateLucasNumber(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;

        long ppr = 2;
        long pr = 1;
        for (int i = 2; i <= n; i++) {
            long lucas = ppr + pr;
            ppr = pr;
            pr = lucas;
        }
        return pr;
    }
}