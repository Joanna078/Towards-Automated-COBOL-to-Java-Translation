import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sm = 0;
        int cnt = 1;
        int prev = Integer.parseInt(s.substring(0, 1));
        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(s.substring(i, i + 1));
            if (prev != num) {
                sm += cnt / 2;
                cnt = 1;
            } else {
                cnt++;
            }
            prev = num;
        }
        sm += cnt / 2;
        System.out.println(sm);
    }
}