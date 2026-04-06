import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int ir = 0;
        int ig = 0;
        int ib = 0;
        int rn[] = new int[4001];
        int gn[] = new int[4001];
        int bn[] = new int[4001];
        Arrays.fill(rn, 0);
        Arrays.fill(gn, 0);
        Arrays.fill(bn, 0);
        for (int i = 0; i < s.length(); i++) { // Corrected loop condition
            if (s.charAt(i) == 'R') {
                ir++;
                rn[ir] = i + 1;
            } else if (s.charAt(i) == 'G') {
                ig++;
                gn[ig] = i + 1;
            } else if (s.charAt(i) == 'B') {
                ib++;
                bn[ib] = i + 1;
            }
        }
        int ks = 0;
        for (int i1 = 1; i1 <= ir; i1++) {
            for (int i2 = 1; i2 <= ig; i2++) {
                for (int i3 = 1; i3 <= ib; i3++) {
                    int s1 = rn[i1] - gn[i2];
                    int s2 = gn[i2] - bn[i3];
                    int s3 = rn[i1] - bn[i3];
                    if ((s1 == s2) || (s1 == s3) || (s2 == s3)) continue;
                    ks++;
                }
            }
        }
        System.out.println(ks);
    }
}