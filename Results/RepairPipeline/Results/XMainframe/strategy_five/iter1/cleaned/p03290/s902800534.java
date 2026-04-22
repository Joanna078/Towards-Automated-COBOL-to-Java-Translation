public class ABC_104_C {
    public static void main(String[] args) {
        // Initialize variables
        int maxNum = 1000;
        int hxd = 16;
        int numOff = 0;
        int numOn = 1;
        int numX = 9;
        String hNum = "0000";
        String hTxt = "    ";
        String bTxt = "                ";
        int dNum = 0;
        int xTh = 0;
        int xDiv = 0;
        int nBit = 0;
        String inp = "";
        int d = 0;
        long g = 0;
        int nm = 0;
        long pt = 0;
        int[][] problem = new int[1000][2];
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        int mx = 0;
        int num = 0;
        long point = 0;
        int mnnum = 0;
        String ans = "    ";
        int flg = 0;
        int ext = 0;
        String zs = "00000";
        String dummy = "";

        // Accept input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        inp = scanner.nextLine();

        // Unstring input
        String[] parts = inp.split(" ");
        d = Integer.parseInt(parts[0]);
        g = Long.parseLong(parts[1]);

        // Perform loop
        for (i = 1; i <= d; i++) {
            inp = scanner.nextLine();
            parts = inp.split(" ");
            nm = Integer.parseInt(parts[0]);
            pt = Long.parseLong(parts[1]);
            problem[i - 1][0] = nm;
            problem[i - 1][1] = (int) pt;
        }

        // Call external setup
        setExternal();

        // Create binary table
        bTable();

        // Compute mx
        mx = (int) Math.pow(2, d) - 1;

        // Add 1 to MAX_NUM to get mnnum
        mnnum = maxNum + 1;

        // Main loop
        for (i = 0; i <= mx; i++) {
            dNum = i;
            dcmToBny(dNum, bTxt);

            num = 0;
            point = 0;

            for (j = 1; j <= d; j++) {
                nBit = Character.getNumericValue(bTxt.charAt(hxd - j));

                if (numOn == nBit) {
                    num += problem[j - 1][0];
                    point += j * 100 * problem[j - 1][0];
                    point += problem[j - 1][1];
                }
            }

            flg = 1;
            fillPoint();

            if (flg == 1) {
                mnnum = Math.min(mnnum, num);
            }
        }

        zs = String.format("%05d", mnnum);
        unAns();

        System.out.println(ans.trim());

        scanner.close();
    }

    public static void setExternal() {
        // Set external constants
        int bny = 2;
        int bit4 = 4;
        int byt4 = 4;
        int byt32 = 32;
        int byt256 = 256;
        int hxd = 16;
        int numOff = 0;
        int numOn = 1;
        int numX = 9;
        int oct = 8;

        String hTbl1 = "0123456789ABCDEF";
    }

    public static void bTable() {
        // Create binary table
        int hxd = 16;
        int bny = 2;
        int byt4 = 4;
        int oct = 8;

        String[] bTbl1 = new String[16];

        for (int i = 0; i <= hxd; i++) {
            int q = i;
            String str = "";

            while (q > 0) {
                int r = q % bny;
                q /= bny;
                str = r + str;
            }

            while (str.length() < 4) {
                str = "0" + str;
            }

            bTbl1[i] = str;
        }
    }

    public static void dcmToBny(int dNum, String bTxt) {
        // Convert decimal to binary
        int bny = 2;
        int byt4 = 4;
        int byt32 = 32;
        int byt256 = 256;
        int hxd = 16;
        int oct = 8;

        String[] bTbl1 = new String[16];
        String[] hTbl1 = new String[16];

        for (int i = 0; i < 16; i++) {
            bTbl1[i] = String.format("%4s", Integer.toBinaryString(i)).replace(' ', '0');
            hTbl1[i] = Integer.toHexString(i).toUpperCase();
        }

        bTxt = "";
        int q = dNum;

        while (q > 0) {
            int r = q % hxd;
            q /= hxd;
            bTxt = bTbl1[r] + bTxt;
        }

        while (bTxt.length() < 16) {
            bTxt = "0000" + bTxt;
        }
    }

    public static void fillPoint() {
        // Fill point logic
        // This method should be implemented based on the logic in the COBOL program
    }

    public static void unAns() {
        // Unans logic
        // This method should be implemented based on the logic in the COBOL program
    }
}