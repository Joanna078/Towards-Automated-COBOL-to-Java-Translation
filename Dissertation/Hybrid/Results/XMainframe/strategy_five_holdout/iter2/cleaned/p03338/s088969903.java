import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        
        char[] X = new char[26];
        char[] Y = new char[26];
        int XNUM = 0;
        int YNUM = 0;
        
        int cntmax = 0;
        
        for (int i = 0; i < N; i++) {
            XNUM = 0;
            YNUM = 0;
            
            for (int j = i; j < N; j++) {
                boolean foundX = false;
                for (int k = 0; k < XNUM; k++) {
                    if (X[k] == s[j]) {
                        foundX = true;
                        break;
                    }
                }
                if (!foundX) {
                    X[XNUM++] = s[j];
                }
                
                if (j + 1 < N) {
                    boolean foundY = false;
                    for (int k = 0; k < YNUM; k++) {
                        if (Y[k] == s[j + 1]) {
                            foundY = true;
                            break;
                        }
                    }
                    if (!foundY) {
                        Y[YNUM++] = s[j + 1];
                    }
                }
                
                if (XNUM == YNUM) {
                    cntmax = Math.max(cntmax, XNUM);
                }
            }
        }
        
        System.out.println(cntmax);
    }
}