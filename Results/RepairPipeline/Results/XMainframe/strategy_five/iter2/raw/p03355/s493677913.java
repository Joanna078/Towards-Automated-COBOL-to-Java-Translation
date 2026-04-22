```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        int len = s.length();
        int sN = 0;
        if (len < 5) {
            sN = len * (len + 1) / 2;
        } else {
            sN = (len - 4) * 5 + 10;
        }
        List<String> dic = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= 5 && i + j <= len; j++) {
                dic.add(s.substring(i, i + j));
            }
        }
        Collections.sort(dic);
        int i = 0;
        int j = 0;
        while (i < k) {
            int jw = j;
            while (j < dic.size() && dic.get(j).equals(dic.get(jw))) {
                j++;
            }
            i++;
        }
        System.out.println(dic.get(j - 1).trim());
    }
}
```