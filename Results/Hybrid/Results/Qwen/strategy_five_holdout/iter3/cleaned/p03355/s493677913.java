import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "your_input_string_here"; // Replace with actual input
        int k = 1; // Replace with actual input

        char[] sArray = s.toCharArray();
        int len = sArray.length;
        int sN;
        if (len < 5) {
            sN = len * (len + 1) / 2;
        } else {
            sN = (len - 4) * 5 + 10;
        }

        String[] dic = new String[sN];
        int ix = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 5 && i + j < len; j++) {
                dic[ix++] = new String(Arrays.copyOfRange(sArray, i, i + j + 1));
            }
        }

        Arrays.sort(dic);

        int i = 1, j = 1;
        while (i < k) {
            int jw = j;
            while (jw < dic.length && jw > 0 && dic[jw].equals(dic[jw - 1])) {
                jw++;
            }
            i++;
            j = jw;
        }

        System.out.println(dic[j - 1].trim());
    }
}