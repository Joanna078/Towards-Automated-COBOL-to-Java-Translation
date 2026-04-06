import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int maxlen = 3;
        int cur = 1;
        int len = 1;
        int[] abc = new int[3];

        for (int i = 0; i < maxlen; i++) {
            if (inp.charAt(cur - 1) == 'a') {
                abc[0] = 1;
            } else if (inp.charAt(cur - 1) == 'b') {
                abc[1] = 1;
            } else {
                abc[2] = 1;
            }
            cur++;
        }

        if (abc[0] == 1 && abc[1] == 1 && abc[2] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
