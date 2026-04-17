import java.util.Scanner;

public class ABEGINNER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int inN = Integer.parseInt(parts[0]);
        String[] iStr = new String[inN];
        
        for (int i = 0; i < inN; i++) {
            iStr[i] = scanner.nextLine();
        }

        if (inN > 1) {
            int i = inN / 2;
            while (i > 0) {
                int l = inN - i;
                for (int k = 1; k <= l; k++) {
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
                }
                i /= 2;
            }
        }

        int max = 0;
        int cntMax = 0;
        String[] iMax = new String[20000];

        for (int i = 0; i < inN; i++) {
            int j = i + 1;
            while (j <= inN && iStr[i].equals(iStr[j - 1])) {
                j++;
            }
            if (j - i > max) {
                max = j - i;
                cntMax = 1;
                iMax[0] = iStr[i];
            } else if (j - i == max) {
                iMax[cntMax++] = iStr[i];
            }
            i = j - 1;
        }

        for (int i = 0; i < cntMax; i++) {
            System.out.println(iMax[i]);
        }
    }
}