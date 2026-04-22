import java.util.Scanner;

public class ABC_042_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int maxlen = 3;
        int cur = 0;
        int i = 0;
        int[] abc = new int[3];
        int five = 0;
        int seven = 0;

        for (int n = 0; n < maxlen && i < abc.length; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abc[i] = Integer.parseInt(inp.substring(cur, j));
                cur = j + 1;
                i++;
            }
        }

        for (int k = 0; k < i; k++) {
            if (abc[k] == 5) {
                five++;
            } else if (abc[k] == 7) {
                seven++;
            }
        }

        if (five == 2 && seven == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}