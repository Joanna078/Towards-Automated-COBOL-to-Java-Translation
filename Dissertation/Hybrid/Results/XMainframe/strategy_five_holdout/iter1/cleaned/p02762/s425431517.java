import java.util.Arrays;

public class DFriend {
    private static String INP;
    private static char[] IN_DATA = new char[20];
    private static int[] IN_LEN = new int[2];
    private static int IN_N;
    private static int IN_M;
    private static int IN_K;
    private static int IN_X;
    private static int IN_Y;
    private static int C_FR2;
    private static int[][] TBL_FRIEND = new int[100000][2];
    private static int[][] TBL_FRIEND2 = new int[200001][2];
    private static char[] FLG_SEARCH = new char[100000];
    private static int[][] TBL_BLOCK = new int[100000][2];
    private static int S_KEY;
    private static int[] TBL_SEARCH_FRI = new int[100000];
    private static int[] TBL_SEARCH_POS = new int[100000];
    private static int[] TBL_KOHO = new int[100000];
    private static int[] IDX_IJ = new int[2];
    private static int[] INDEX_AREA = new int[4];
    private static int P_F;
    private static int P_B;
    private static int LVL;
    private static int LEN;
    private static char[] FLAG_AREA = new char[4];
    private static char[] EDIT_AREA = new char[6];
    private static char[] OUT_K = new char[600001];

    public static void main(String[] args) {
        // Simulate input for demonstration purposes
        INP = "10 20 30";
        accept(INP);
        unstring(INP, ' ', IN_LEN);

        C_FR2 = IN_M * 2;

        for (int i = 0; i < IN_N; i++) {
            TBL_KOHO[i] = 0;
        }

        for (int i = 0; i < IN_M; i++) {
            INP = "5 10";
            unstring(INP, ' ', IN_DATA);
            IN_X = Character.getNumericValue(IN_DATA[0]);
            IN_Y = Character.getNumericValue(IN_DATA[1]);

            if (IN_X < IN_Y) {
                TBL_FRIEND[i][0] = IN_X;
                TBL_FRIEND[i][1] = IN_Y;
            } else {
                TBL_FRIEND[i][0] = IN_Y;
                TBL_FRIEND[i][1] = IN_X;
            }

            TBL_FRIEND2[i][0] = IN_X;
            TBL_FRIEND2[i][1] = IN_Y;
            TBL_FRIEND2[i + IN_M][0] = IN_Y;
            TBL_FRIEND2[i + IN_M][1] = IN_X;
        }

        for (int i = 0; i < IN_K; i++) {
            INP = "15 20";
            unstring(INP, ' ', IN_DATA);
            IN_X = Character.getNumericValue(IN_DATA[0]);
            IN_Y = Character.getNumericValue(IN_DATA[1]);

            if (IN_X < IN_Y) {
                TBL_BLOCK[i][0] = IN_X;
                TBL_BLOCK[i][1] = IN_Y;
            } else {
                TBL_BLOCK[i][0] = IN_Y;
                TBL_BLOCK[i][1] = IN_X;
            }
        }

        Arrays.sort(TBL_FRIEND, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        Arrays.sort(TBL_BLOCK, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        Arrays.sort(TBL_FRIEND2, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        P_F = 1;
        P_B = 1;

        for (int i = 0; i < IN_N; i++) {
            int K = i + 1;
            for (int j = K; j < IN_N; j++) {
                friendCheck();
                blockCheck();

                if (FLAG_AREA[2] == '0' && FLAG_AREA[3] == '0') {
                    Arrays.fill(FLG_SEARCH, ' ');
                    FLAG_AREA[1] = '0';
                    LVL = 1;
                    TBL_SEARCH_FRI[LVL] = i;

                    friendSearch();

                    if (FLAG_AREA[1] == '1') {
                        TBL_KOHO[i]++;
                        TBL_KOHO[j]++;
                    }
                }
            }
        }

        LEN = 0;
        for (int i = 0; i < IN_N; i++) {
            int num = TBL_KOHO[i];
            for (int j = 5; j > 0; j--) {
                if (j < 1 || EDIT_AREA[j - 1] == ' ') {
                    break;
                }
            }
            System.arraycopy(EDIT_AREA, j, OUT_K, LEN, 6 - j);
            Arrays.fill(OUT_K, LEN + 7 - j, LEN + 7, ' ');
            LEN += 7 - j;
        }
        System.out.println(new String(OUT_K, 0, LEN - 1));
    }

    private static void accept(String inp) {
        INP = inp;
    }

    private static void unstring(String inp, char delimiter, int[] result) {
        String[] parts = inp.split(Character.toString(delimiter));
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
    }

    private static void friendCheck() {
        while (P_F <= IN_M && IDX_IJ[0] > TBL_FRIEND[P_F - 1][0]) {
            P_F++;
        }
        if (IDX_IJ[0] == TBL_FRIEND[P_F - 1][0]) {
            FLAG_AREA[2] = '1';
        } else {
            FLAG_AREA[2] = '0';
        }
    }

    private static void blockCheck() {
        while (P_B <= IN_K && IDX_IJ[0] > TBL_BLOCK[P_B - 1][0]) {
            P_B++;
        }
        if (IDX_IJ[0] == TBL_BLOCK[P_B - 1][0]) {
            FLAG_AREA[3] = '1';
        } else {
            FLAG_AREA[3] = '0';
        }
    }

    private static void friendSearch() {
        searchFri();
        while (TBL_SEARCH_POS[LVL] < 1 || FLAG_AREA[1] == '1' || TBL_FRIEND2[TBL_SEARCH_POS[LVL] - 1][0] != TBL_SEARCH_FRI[LVL]) {
            if (TBL_FRIEND2[TBL_SEARCH_POS[LVL] - 1][1] == IDX_IJ[1]) {
                FLAG_AREA[1] = '1';
            } else {
                if (FLG_SEARCH[TBL_FRIEND2[TBL_SEARCH_POS[LVL] - 1][1]] == ' ') {
                    FLG_SEARCH[TBL_FRIEND2[TBL_SEARCH_POS[LVL] - 1][1]] = '1';
                    TBL_SEARCH_FRI[LVL + 1] = TBL_FRIEND2[TBL_SEARCH_POS[LVL] - 1][1];
                    LVL++;
                    friendSearch();
                    LVL--;
                }
            }
            TBL_SEARCH_POS[LVL]++;
        }
    }

    private static void searchFri() {
        S_KEY = TBL_SEARCH_FRI[LVL];
        INDEX_AREA[1] = 1;
        INDEX_AREA[2] = C_FR2;
        INDEX_AREA[0] = 0;
        INDEX_AREA[3] = (INDEX_AREA[1] + INDEX_AREA[2]) / 2;

        while (INDEX_AREA[1] <= INDEX_AREA[2] && INDEX_AREA[0] == 0) {
            if (S_KEY == TBL_FRIEND2[INDEX_AREA[3] - 1][0]) {
                INDEX_AREA[0] = INDEX_AREA[3];
            } else if (S_KEY < TBL_FRIEND2[INDEX_AREA[3] - 1][0]) {
                INDEX_AREA[2] = INDEX_AREA[3] - 1;
            } else {
                INDEX_AREA[1] = INDEX_AREA[3] + 1;
            }
            INDEX_AREA[3] = (INDEX_AREA[1] + INDEX_AREA[2]) / 2;
        }

        while (INDEX_AREA[0] < 2 && S_KEY != TBL_FRIEND2[INDEX_AREA[0] - 1][0]) {
            INDEX_AREA[0]--;
        }

        TBL_SEARCH_POS[LVL] = INDEX_AREA[0];
    }
}