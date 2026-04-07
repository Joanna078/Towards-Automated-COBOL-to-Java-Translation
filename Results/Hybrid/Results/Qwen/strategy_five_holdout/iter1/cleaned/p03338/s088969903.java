import java.util.Scanner;

public class ABC_098_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        char[] x = new char[26];
        Arrays.fill(x, ' ');
        int xNum = 0;

        char[] y = new char[26];
        Arrays.fill(y, ' ');
        int yNum = 0;

        int cntMax = 0;

        for (int i = 0; i < n; i++) {
            char chr = s.charAt(i);

            boolean foundX = false;
            for (int j = 0; j < xNum; j++) {
                if (x[j] == chr) {
                    foundX = true;
                    break;
                }
            }

            if (!foundX) {
                x[xNum++] = chr;
            }

            String str = s.substring(i + 1);

            for (int j = 0; j < str.length(); j++) {
                chr = str.charAt(j);

                boolean foundY = false;
                for (int k = 0; k < yNum; k++) {
                    if (y[k] == chr) {
                        foundY = true;
                        break;
                    }
                }

                if (!foundY) {
                    y[yNum++] = chr;
                }
            }

            int cnt = 0;
            for (int j = 0; j < xNum; j++) {
                for (int k = 0; k < yNum; k++) {
                    if (x[j] == y[k]) {
                        cnt++;
                    }
                }
            }

            cntMax = Math.max(cntMax, cnt);
        }

        System.out.println(cntMax);
    }
}