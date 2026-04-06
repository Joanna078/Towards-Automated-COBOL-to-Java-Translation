import java.util.Arrays;
import java.util.Scanner;

public class ABeginner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int dtL1 = parts.length;
        String dtX1 = String.join("", Arrays.copyOfRange(parts, 0, dtL1));
        int inN = Integer.parseInt(dtX1.substring(0, dtL1));

        String[] iStr = new String[inN];
        for (int i = 0; i < inN; i++) {
            iStr[i] = scanner.nextLine();
        }

        if (inN > 1) {
            // Shell sort
            int i = inN / 2;
            while (i > 0) {
                int l = inN - i;
                int k = 1;
                while (k <= l) {
                    int j = k;
                    while (j > 0) {
                        if (iStr[j - 1].compareTo(iStr[j + i - 1]) > 0) {
                            String wStr = iStr[j - 1];
                            iStr[j - 1] = iStr[j + i - 1];
                            iStr[j + i - 1] = wStr;
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
        String[] iMax = new String[20000];

        for (int i = 0; i < inN; i++) {
            int j = i;
            while (j < inN && iStr[j].equals(iStr[i])) {
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
            i = j;
        }

        for (int i = 0; i < cntMax; i++) {
            System.out.println(iMax[i]);
        }
    }
}