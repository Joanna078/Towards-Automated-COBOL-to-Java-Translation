import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class AGC_025_B {

    private boolean initialized = false;
    private int entry;

    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);

    private BigInteger b_RETURN_CODE = BigInteger.ZERO;
    private BigInteger b_FIX = BigInteger.ONE;
    private BigInteger b_VIX = BigInteger.ONE;
    private BigInteger b_IIX = BigInteger.ONE;
    private BigInteger b_MIX = BigInteger.ONE;
    private BigInteger b_CIX = BigInteger.ONE;
    private String b_INF = "0998244353";
    private String b_BNY = "02";
    private char[] b_F1 = new char[3000000];
    private char[] b_V1 = new char[3000000];
    private char[] b_IV1 = new char[3000000];
    private char[] b_CM1 = new char[3000000];
    private String b_INP = " ".repeat(34);
    private String b_N = "0".repeat(6);
    private String b_AX = "0".repeat(6);
    private String b_BX = "0".repeat(6);
    private String b_K = "0".repeat(12);
    private String b_half = "0".repeat(6);
    private int b_a = 0;
    private int b_b = 0;
    private long b_tmp = 0;
    private String b_rm = "0".repeat(12);
    private String b_dv = "0".repeat(12);
    private String b_dvx = "0".repeat(19);
    private String b_d = "0".repeat(19);
    private long b_i = 0;
    private long b_j = 0;
    private long b_mi = 0;
    private String b_d_num = "0".repeat(10);
    private String b_d_ret = "0".repeat(10);
    private String b_comba = "0".repeat(10);
    private String b_combb = "0".repeat(10);
    private String b_m = "0".repeat(10);
    private String b_sm = "0".repeat(18);
    private long b_md = 0;
    private String b_t = "0".repeat(19);
    private String b_ans = " ".repeat(11);
    private String b_ZS = " ".repeat(19);
    private char b_DUMMY = ' ';

    public static void main(String[] args) {
        new AGC_025_B().AGC_025_B_(0);
    }

    public int AGC_025_B_(int entry) {
        this.entry = entry;
        return run_module(entry);
    }

    private int run_module(int entry) {
        if (entry < 0) {
            if (!initialized) {
                initialized = true;
                return 0;
            }
            d0 = BigDecimal.ZERO;
            d1 = BigDecimal.ZERO;
            initialized = false;
            return 0;
        }

        if (!initialized) {
            b_RETURN_CODE = BigInteger.ZERO;
            b_FIX = BigInteger.ONE;
            b_VIX = BigInteger.ONE;
            b_IIX = BigInteger.ONE;
            b_MIX = BigInteger.ONE;
            b_CIX = BigInteger.ONE;
            b_INF = "0998244353";
            b_BNY = "02";
            b_F1 = new char[3000000];
            b_V1 = new char[3000000];
            b_IV1 = new char[3000000];
            b_CM1 = new char[3000000];
            b_INP = " ".repeat(34);
            b_N = "0".repeat(6);
            b_AX = "0".repeat(6);
            b_BX = "0".repeat(6);
            b_K = "0".repeat(12);
            b_half = "0".repeat(6);
            b_a = 0;
            b_b = 0;
            b_tmp = 0;
            b_rm = "0".repeat(12);
            b_dv = "0".repeat(12);
            b_dvx = "0".repeat(19);
            b_d = "0".repeat(19);
            b_i = 0;
            b_j = 0;
            b_mi = 0;
            b_d_num = "0".repeat(10);
            b_d_ret = "0".repeat(10);
            b_comba = "0".repeat(10);
            b_combb = "0".repeat(10);
            b_m = "0".repeat(10);
            b_sm = "0".repeat(18);
            b_md = 0;
            b_t = "0".repeat(19);
            b_ans = " ".repeat(11);
            b_ZS = " ".repeat(19);
            b_DUMMY = ' ';
            initialized = true;
        }

        try {
            execEntry(l_AGC_025_B);
        } catch (Exception e) {
            System.exit(b_RETURN_CODE.intValue());
        }

        return b_RETURN_CODE.intValue();
    }

    private void execEntry(int start) throws Exception {
        switch (start) {
            case l_AGC_025_B:
                execMain();
                break;
            // Add other cases as needed
        }
    }

    private void execMain() throws Exception {
        Scanner scanner = new Scanner(System.in);
        b_INP = scanner.nextLine();

        String[] parts = b_INP.split("\\s+");
        b_N = parts[0];
        b_AX = parts[1];
        b_BX = parts[2];
        b_K = parts[3];

        b_d_num = b_N;
        b_half = new BigDecimal(b_d_num).divide(new BigDecimal(b_BNY), 4, BigDecimal.ROUND_HALF_UP).toString();

        factCalc();
        b_sm = " ".repeat(18);

        for (b_i = 1; b_i <= Long.parseLong(b_N); b_i++) {
            if (b_K.equals("0")) {
                b_sm = String.valueOf(Integer.parseInt(b_sm) + 1);
                break;
            }

            b_a = (int) b_i;
            b_tmp = Integer.parseInt(b_AX) * b_a;

            if (b_tmp.compareTo(Long.parseLong(b_K)) > 0) {
                break;
            }

            b_rm = String.valueOf(Long.parseLong(b_K) - b_tmp);

            b_dv = new BigDecimal(b_rm).divide(new BigDecimal(b_BX), 4, BigDecimal.ROUND_HALF_UP).toString();

            if (b_rm.equals("0") && b_dv.compareTo(new BigDecimal(b_N)) <= 0) {
                b_b = b_dv;

                b_comba = "0000000001";
                if (b_a != 0 && b_a != Long.parseLong(b_N)) {
                    if (b_a < Long.parseLong(b_half)) {
                        b_a = Long.parseLong(b_N) - b_a;
                    }
                    b_MIX = b_a;
                    b_comba = String.copyValueOf(b_CM1, (int) (b_MIX - 1) * 10, 10);
                }

                b_combb = "0000000001";
                if (b_b != 0 && b_b != Long.parseLong(b_N)) {
                    if (b_b < Long.parseLong(b_half)) {
                        b_b = Long.parseLong(b_N) - b_b;
                    }
                    b_MIX = b_b;
                    b_combb = String.copyValueOf(b_CM1, (int) (b_MIX - 1) * 10, 10);
                }

                b_dvx = new BigDecimal(b_comba).multiply(new BigDecimal(b_combb)).toString();
                b_m = new BigDecimal(b_dvx).divide(new BigDecimal(b_INF), 4, BigDecimal.ROUND_HALF_UP).toString();
                b_sm = String.valueOf(Integer.parseInt(b_sm) + Integer.parseInt(b_m));

                if (new BigDecimal(b_INF).compareTo(new BigDecimal(b_sm)) < 0) {
                    b_sm = String.valueOf(Integer.parseInt(b_sm) - Integer.parseInt(b_INF));
                }
            }
        }

        b_ZS = b_sm;
        unans();
        System.out.println(b_ans.trim());
        System.exit(b_RETURN_CODE.intValue());
    }

    private void factCalc() {
        b_i = 1;
        b_FIX = BigInteger.valueOf(b_i);
        System.arraycopy("0000000001".toCharArray(), 0, b_F1, (int) (b_FIX - 1) * 10, 10);

        b_VIX = BigInteger.valueOf(b_i);
        System.arraycopy("0000000001".toCharArray(), 0, b_V1, (int) (b_VIX - 1) * 10, 10);

        b_IIX = BigInteger.valueOf(b_i);
        System.arraycopy("0000000001".toCharArray(), 0, b_IV1, (int) (b_IIX - 1) * 10, 10);

        for (b_i = Long.parseLong(b_BNY); b_i <= Long.parseLong(b_d_num); b_i++) {
            b_t = new BigDecimal(b_i).multiply(new BigDecimal(new String(b_F1, (int) (b_FIX - 1) * 10, 10))).toString();
            b_d = new BigDecimal(b_t).divide(new BigDecimal(b_INF), 4, BigDecimal.ROUND_HALF_UP).toString();
            b_FIX = b_FIX.add(BigInteger.ONE);
            System.arraycopy(b_md.toString().toCharArray(), 0, b_F1, (int) (b_FIX - 1) * 10, 10);

            b_INF = new BigDecimal(b_INF).divide(new BigDecimal(b_i), 4, BigDecimal.ROUND_HALF_UP).toString();
            b_md = new BigDecimal(b_INF).subtract(new BigDecimal(b_d)).longValue();
            b_VIX = b_md;
            b_d = new BigDecimal(new String(b_V1, (int) (b_VIX - 1) * 10, 10)).multiply(new BigDecimal(b_d)).toString();
            b_d = new BigDecimal(b_d).divide(new BigDecimal(b_INF), 4, BigDecimal.ROUND_HALF_UP).toString();
            b_VIX = b_i;
            System.arraycopy(b_d.toString().toCharArray(), 0, b_V1, (int) (b_VIX - 1) * 10, 10);

            b_IIX = b_md;
            b_d = new BigDecimal(new String(b_IV1, (int) (b_IIX - 1) * 10, 10)).multiply(new BigDecimal(b_d)).toString();
            b_IIX = b_IIX.add(BigInteger.ONE);
            System.arraycopy(b_d.toString().toCharArray(), 0, b_IV1, (int) (b_IIX - 1) * 10, 10);
        }

        b_d_ret = new String(b_F1, (int) (b_FIX - 1) * 10, 10);
        b_i = 1;
        b_CIX = BigInteger.valueOf(b_i);
        System.arraycopy(b_d_num.toCharArray(), 0, b_CM1, (int) (b_CIX - 1) * 10, 10);

        for (b_i = Long.parseLong(b_BNY); b_i <= Long.parseLong(b_half); b_i++) {
            b_mi = Long.parseLong(b_N) - b_i;
            b_MIX = b_i;
            b_d = new BigDecimal(new String(b_F1, (int) (b_FIX - 1) * 10, 10)).multiply(new BigDecimal(new String(b_IV1, (int) (b_IIX - 1) * 10, 10))).toString();
            b_d = new BigDecimal(b_d).divide(new BigDecimal(b_INF), 4, BigDecimal.ROUND_HALF_UP).toString();
            b_d = new BigDecimal(b_d).multiply(new BigDecimal(new String(b_IV1, (int) (b_MIX - 1) * 10, 10))).toString();
            b_d = new BigDecimal(b_d).divide(new BigDecimal(b_INF), 4, BigDecimal.ROUND_HALF_UP).toString();
            b_CIX = b_CIX.add(BigInteger.ONE);
            System.arraycopy(b_d.toString().toCharArray(), 0, b_CM1, (int) (b_CIX - 1) * 10, 10);
        }
    }

    private void unans() {
        String[] parts = b_ZS.split("\\s+");
        b_DUMMY = parts[0].charAt(0);
        b_ans = parts[1];
    }

    private final static int l_AGC_025_B = 1;
    private final static int l_MAIN = 2;
    private final static int l_UNANS = 4;
    private final static int l_FACT_CALC = 6;
}