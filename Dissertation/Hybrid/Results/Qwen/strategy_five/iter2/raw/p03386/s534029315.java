```java
import java.util.ArrayList;
import java.util.Collections;

public class ABC_093_B {
    public static void main(String[] args) {
        String inp = "your_input_here"; // Replace with actual input
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        ArrayList<Integer> abk = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        while (cur <= inp.length()) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            int len = j - cur;
            if (len > 0) { // Ensure there's a substring to parse
                abk.add(Integer.parseInt(inp.substring(cur - 1, j - 1)));
            }
            cur = j + 1;
            i++;
        }

        int idx = 1;
        while (idx <= abk.get(0)) {
            if (idx <= abk.get(2)) {
                a.add(idx);
                idx++;
            } else {
                break;
            }
        }

        int tmp = idx - 1;
        idx = 1;
        while (idx <= abk.get(1)) {
            if (tmp > 0 && a.get(tmp - 1) < abk.get(1) - idx + 1) {
                b.add(abk.get(1) - idx + 1);
                idx++;
            } else {
                break;
            }
        }

        Collections.sort(a);
        Collections.sort(b);

        for (int m = 0; m < a.size(); m++) {
            String zs = String.valueOf(a.get(m));
            unans(zs);
            System.out.println(ans);
        }

        for (int p = b.size() - 1; p >= 0; p--) {
            String zs = String.valueOf(b.get(p));
            unans(zs);
            System.out.println(ans);
        }
    }

    private static String ans = "";

    private static void unans(String zs) {
        ans = zs.replaceAll("\\s+", "");
    }
}
```