import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sm = 0;
        int cnt = 1;
        int prev = Character.getNumericValue(s.charAt(0));
        for (int i = 1; i < n; i++) {
            int num = Character.getNumericValue(s.charAt(i));
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