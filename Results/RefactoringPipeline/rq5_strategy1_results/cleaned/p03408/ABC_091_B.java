import java.util.Arrays;

public class ABC_091_B {

    private boolean initialized = false;
    private int entry;
    private int returnCode = 0;
    private int i, j, N, M, slen, tlen;
    private String tmpkey = " ".repeat(10);
    private String tmpval = "0".repeat(3);
    private String tmp = "0".repeat(3);
    private String point = "0".repeat(3);
    private String ans = " ".repeat(3);
    private String ZS = "0000";
    private String flg = "0";
    private String DUMMY = " ";
    private String[] skey = new String[100];
    private String[] sval = new String[100];
    private String[] tkey = new String[100];
    private String[] tval = new String[100];

    public static void main(String[] args) {
        new ABC_091_B().execute();
    }

    public void execute() {
        run_module(0);
    }

    private void run_module(int entry) {
        if (entry < 0) {
            if (!initialized) {
                initialize();
                return;
            }
            clear();
            initialized = false;
            return;
        }

        if (!initialized) {
            initialize();
        }

        mainSection();
    }

    private void initialize() {
        Arrays.fill(skey, " ".repeat(10));
        Arrays.fill(sval, "0".repeat(3));
        Arrays.fill(tkey, " ".repeat(10));
        Arrays.fill(tval, "0".repeat(3));
        initialized = true;
    }

    private void clear() {
        returnCode = 0;
        i = 0;
        j = 0;
        N = 0;
        M = 0;
        slen = 0;
        tlen = 0;
        tmpkey = " ".repeat(10);
        tmpval = "0".repeat(3);
        tmp = "0".repeat(3);
        point = "0".repeat(3);
        ans = " ".repeat(3);
        ZS = "0000";
        flg = "0";
        DUMMY = " ";
    }

    private void mainSection() {
        accept(N);
        for (i = 1; i <= N; i++) {
            accept(tmpkey);
            flg = "0";
            for (j = 1; j <= slen; j++) {
                if (skey[j - 1].equals(tmpkey)) {
                    flg = "1";
                    add(sval[j - 1], 1);
                }
            }
            if (flg.equals("0")) {
                skey[slen] = tmpkey;
                sval[slen] = "001";
                slen++;
            }
        }

        accept(M);
        for (i = 1; i <= M; i++) {
            accept(tmpkey);
            flg = "0";
            for (j = 1; j <= tlen; j++) {
                if (tkey[j - 1].equals(tmpkey)) {
                    flg = "1";
                    add(tval[j - 1], 1);
                }
            }
            if (flg.equals("0")) {
                tkey[tlen] = tmpkey;
                tval[tlen] = "001";
                tlen++;
            }
        }

        for (i = 1; i <= slen; i++) {
            tmp = sval[i - 1];
            for (j = 1; j <= tlen; j++) {
                if (skey[i - 1].equals(tkey[j - 1])) {
                    subtract(tmp, tval[j - 1]);
                }
            }
            point = max(point, tmp);
        }

        ZS = point;
        unansSection();
        display(ans);
        stop();
    }

    private void accept(int variable) {
        // Simulate accepting input for demonstration purposes
        variable = Integer.parseInt(System.console().readLine());
    }

    private void accept(String variable) {
        // Simulate accepting input for demonstration purposes
        variable = System.console().readLine();
    }

    private void add(String value, int amount) {
        int num = Integer.parseInt(value) + amount;
        value = String.format("%03d", num);
    }

    private void subtract(String value, String other) {
        int num = Integer.parseInt(value) - Integer.parseInt(other);
        value = String.format("%03d", num);
    }

    private String max(String a, String b) {
        return Integer.parseInt(a) > Integer.parseInt(b) ? a : b;
    }

    private void unansSection() {
        String[] parts = ZS.split("\\s+");
        ans = parts[parts.length - 1];
    }

    private void display(String value) {
        System.out.println(value.trim());
    }

    private void stop() {
        System.exit(returnCode);
    }
}