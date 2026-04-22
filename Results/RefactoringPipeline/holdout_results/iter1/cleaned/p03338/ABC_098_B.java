import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC_098_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String S = scanner.nextLine();

        int cntmax = 0;

        for (int i = 0; i < N; i++) {
            char chr = S.charAt(i);
            Set<Character> X = new HashSet<>();
            X.add(chr);

            for (int j = i + 1; j < N; j++) {
                char ch = S.charAt(j);
                Set<Character> Y = new HashSet<>();
                Y.add(ch);

                int cnt = 0;
                for (char x : X) {
                    if (Y.contains(x)) {
                        cnt++;
                    }
                }

                cntmax = Math.max(cntmax, cnt);
            }
        }

        System.out.println(cntmax);
    }
}