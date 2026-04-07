import java.util.Scanner;

public class ABC_104_C {
    static int MAX_NUM = 1000;
    static int HXD = 16;
    static int NUM_OFF = 0;
    static int NUM_ON = 1;
    static int NUM_X = 9;
    static String h_num = "0000";
    static String h_txt = "    ";
    static char[] b_txt = new char[16];
    static int d_num = 0;
    static int x_th = 0;
    static int x_div = 0;
    static int n_bit = 0;
    static String INP = "";
    static int D = 0;
    static int G = 0;
    static int nm = 0;
    static int pt = 0;
    static int[][] problem = new int[1000][2];
    static int i = 0;
    static int j = 0;
    static int k = 0;
    static int m = 0;
    static int mx = 0;
    static int num = 0;
    static int point = 0;
    static int mnnum = 0;
    static String ans = "    ";
    static int flg = 0;
    static int ext = 0;
    static String ZS = "00000";
    static String DUMMY = " ";
    static String[] B_TABLE1 = new String[16];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        INP = scanner.nextLine();

        String[] parts = INP.split(" ");
        D = Integer.parseInt(parts[0]);
        G = Integer.parseInt(parts[1]);

        for (i = 1; i <= D; i++) {
            INP = scanner.nextLine();
            parts = INP.split(" ");
            nm = Integer.parseInt(parts[0]);
            pt = Integer.parseInt(parts[1]);
            problem[i - 1][0] = nm;
            problem[i - 1][1] = pt;
        }

        SET_EXTERNAL();
        B_TABLE();

        mx = (int) Math.pow(2, D) - 1;
        mnnum = MAX_NUM + 1;

        for (i = 0; i <= mx; i++) {
            d_num = i;
            DCM_TO_BNY(d_num, b_txt);

            num = 0;
            point = 0;

            for (j = 1; j <= D; j++) {
                n_bit = Character.getNumericValue(b_txt[HXD - j - 1]);
                if (NUM_ON == n_bit) {
                    num += problem[j - 1][0];
                    point += j * 100 * problem[j - 1][0];
                    point += problem[j - 1][1];
                }
            }

            flg = 1;
            FILLPOINT();

            if (flg == 1) {
                mnnum = Math.min(mnnum, num);
            }
        }

        ZS = String.format("%05d", mnnum);
        UNANS();
        System.out.println(ans.trim());
    }

    public static void SET_EXTERNAL() {
        HXD = 16;
        NUM_OFF = 0;
        NUM_ON = 1;
        NUM_X = 9;
        // No need to initialize H_TBL1 here as it's not used in this method
    }

    public static void B_TABLE() {
        for (int i = 0; i < 16; i++) {
            StringBuilder str = new StringBuilder();
            int q = i;
            while (q > 0) {
                int r = q % 2;
                str.insert(0, r);
                q /= 2;
            }
            while (str.length() < 4) {
                str.insert(0, '0');
            }
            B_TABLE1[i] = str.toString();
        }
    }

    public static void DCM_TO_BNY(int d_num, char[] b_txt) {
        for (int i = 0; i < 4; i++) {
            int k = HXD - 4 * i - 1;
            int r = d_num % HXD;
            b_txt[k] = B_TABLE1[r].charAt(0);
            d_num /= HXD;
        }
    }

    public static void FILLPOINT() {
        if (point < G) {
            for (k = D; k > 0; k--) {
                n_bit = Character.getNumericValue(b_txt[HXD - k - 1]);
                if (NUM_OFF == n_bit) {
                    ext = 0;
                    for (m = 1; m <= problem[k - 1][0]; m++) {
                        point += 100 * k;
                        num++;
                        if (m != problem[k - 1][0] && G <= point) {
                            ext = 1;
                            break;
                        } else if (m == problem[k - 1][0]) {
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

    public static void UNANS() {
        ZS = ZS.trim();
        if (ZS.length() > 0) {
            ans = ZS.substring(ZS.length() - 4);
        }
    }
}