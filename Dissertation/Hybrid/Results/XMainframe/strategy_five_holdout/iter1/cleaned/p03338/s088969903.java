import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        int cntmax = 0;
        
        for (int i = 0; i < N; i++) {
            set1.clear();
            set2.clear();
            
            for (int j = i; j < N; j++) {
                set1.add(s[j]);
                
                if (j + 1 < N) {
                    set2.add(s[j + 1]);
                }
                
                if (set1.size() == set2.size()) {
                    cntmax = Math.max(cntmax, set1.size());
                }
            }
        }
        
        System.out.println(cntmax);
    }
}