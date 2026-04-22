import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume newline
        String line = sc.nextLine();
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int cnt = 0;
        
        for (int j = cur; j <= maxlen && j <= line.length(); j++) {
            if (line.charAt(j - 1) == ' ') {
                int len = j - cur;
                String p = line.substring(cur - 1, cur - 1 + len);
                if (!p.equals(Integer.toString(i))) {
                    cnt++;
                }
                cur = j + 1;
                i++;
            }
        }
        
        if (cnt <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}