import java.util.Scanner;

public class ABC_101_C {
    public static void main(String[] args) {
        String inp = ""; // Replace with actual input
        char[] inp2 = new char[700000]; // Replace with actual input
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int len;

        int[] nk = new int[maxlen];
        String ans = "";
        String zs = "";
        String dummy = "";

        // Read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter INP:");
        inp = scanner.nextLine();
        System.out.println("Enter INP2:");
        scanner.nextLine().getChars(0, Math.min(scanner.nextLine().length(), 700000), inp2, 0); // Read up to 700000 characters into inp2

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            nk[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            cur = j + 1;
            i++;
        }

        nk[0] -= nk[1];
        nk[1]--;
        int x = nk[0] / nk[1];
        int r = nk[0] % nk[1];

        if (r != 0) {
            x++;
        }
        x++;
        zs = String.format("%06d", x);

        unans(zs, dummy, ans);

        System.out.println(ans.trim());
    }

    private static void unans(String zs, String dummy, String ans) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            } else {
                break;
            }
        }
        ans = sb.toString();
    }
}