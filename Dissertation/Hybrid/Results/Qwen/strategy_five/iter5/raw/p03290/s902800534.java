```java
import java.util.Arrays;

public class ABC_104_C {
    private static final int MAX_NUM = 1000;
    private static final int[] B_TABLE = new int[16];
    private static final char[] H_TABLE = "0123456789ABCDEF".toCharArray();
    private static final int NUM_OFF = 0;
    private static final int NUM_ON = 1;
    private static final int HXD = 16;

    public static void main(String[] args) {
        String inp = "your_input_here"; // Replace with actual input
        String[] parts = inp.split(" ");
        int d = Integer.parseInt(parts[0]);
        int g = Integer.parseInt(parts[1]);

        int[][] problem = new int[MAX_NUM][2];
        int i = 1;
        while (i <= d) {
            parts = inp.split(" ", 2);
            problem[i][0] = Integer.parseInt(parts[0]);
            problem[i][1] = Integer.parseInt(parts[1]);
            inp = parts[1];
            i++;
        }

        int mx = (int) Math.pow(2, d) - 1;
        int mnnum = MAX_NUM + 1;

        for (i = 0; i <= mx; i++) {
            int dNum = i;
            char[] bTxt = new char[16];
            Arrays.fill(bTxt, '0');

            DcmToBny(dNum, bTxt);

            int num = 0;
            int point = 0;

            for (int j = 1; j <= d; j++) {
                int nBit = Character.getNumericValue(bTxt[HXD - j]) & 1;

                if (NUM_ON == nBit) {
                    num += problem[j][0];
                    point += j * 100 * problem[j][0];
                    point += problem[j][1];
                }
            }

            int flg = 1;
            FillPoint(point, g, bTxt, problem, flg);

            if (flg == 1) {
                mnnum = Math.min(mnnum, num);
            }
        }

        System.out.println(mnnum);
    }

    private static void DcmToBny(int dNum, char[] bTxt) {
        for (int i = 1; i <= 16; i++) {
            int remainder = dNum % 2;
            dNum /= 2;
            bTxt[16 - i] = (char) ('0' + remainder);
        }
    }

    private static void FillPoint(int point, int g, char[] bTxt, int[][] problem, int flg) {
        if (point < g) {
            for (int k = HXD; k > 0; k--) {
                int nBit = Character.getNumericValue(bTxt[HXD - k]) & 1;

                if (NUM_OFF == nBit) {
                    int ext = 0;
                    for (int m = 1; m <= problem[k][0]; m++) {
                        point += 100 * k;
                        int num = 0; // Resetting num as it's not defined in the scope
                        num++;

                        if (m != problem[k][0] && g <= point) {
                            ext = 1;
                            break;
                        } else if (m == problem[k][0]) {
                            flg = 0;
                            ext = 1;
                            break;
                        }
                    }

                    if (ext == 1) {
                        break;
                    }
                }
            }
        }
    }
}
```