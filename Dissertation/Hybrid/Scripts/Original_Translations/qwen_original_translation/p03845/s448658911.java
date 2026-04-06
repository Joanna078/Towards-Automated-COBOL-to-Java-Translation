import java.util.Scanner;

public class ABC_050_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxlen = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        long sm = 0;
        int i = 1;
        int cur = 1;

        while (cur <= maxlen) {
            int j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }
            int len = j - cur;
            int t = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            sm += t;
            cur = j + 1;
            i++;
        }

        int m = Integer.parseInt(scanner.nextLine());

        while (m >= i) {
            String inp2 = scanner.nextLine();
            String[] parts = inp2.split(" ");
            int p = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);

            long tmp = sm - t[p] + x;
            String zs = String.format("%08d", tmp);
            unans(zs);
            System.out.println(ans.trim());
        }

        scanner.close();
    }

    private static String ans = "";

    private static void unans(String zs) {
        String[] parts = zs.split("");
        ans = String.join("", parts);
    }
}