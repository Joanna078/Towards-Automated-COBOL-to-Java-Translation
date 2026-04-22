import java.util.Scanner;

public class ABeginner {

    private static final int MAX_TABLE_SIZE = 20000;
    private static final int STRING_LENGTH = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        String[] iStr = new String[MAX_TABLE_SIZE];

        for (int i = 0; i < n; i++) {
            iStr[i] = parts[i + 1];
        }

        if (n > 1) {
            int i = n / 2;
            while (i > 0) {
                int l = n - i;
                int k = 1;
                while (k <= l) {
                    int j = k;
                    while (j > 0) {
                        if (iStr[j - 1].compareTo(iStr[j + i - 1]) > 0) {
                            String temp = iStr[j - 1];
                            iStr[j - 1] = iStr[j + i - 1];
                            iStr[j + i - 1] = temp;
                            j -= i;
                        } else {
                            j = 0;
                        }
                    }
                    k++;
                }
                i /= 2;
            }
        }

        int max = 0;
        int cntMax = 0;
        String[] iMax = new String[MAX_TABLE_SIZE];

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j <= n && iStr[i].equals(iStr[j - 1])) {
                j++;
            }
            if (j - i > max) {
                max = j - i;
                cntMax = 1;
                iMax[cntMax - 1] = iStr[i];
            } else if (j - i == max) {
                cntMax++;
                iMax[cntMax - 1] = iStr[i];
            }
            i = j - 1;
        }

        for (int i = 0; i < cntMax; i++) {
            System.out.println(iMax[i]);
        }
    }
}