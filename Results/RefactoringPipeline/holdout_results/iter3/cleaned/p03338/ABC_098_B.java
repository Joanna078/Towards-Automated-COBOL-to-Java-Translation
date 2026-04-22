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
            Set<Character> X = new HashSet<>();
            for (int j = i; j < N; j++) {
                X.add(S.charAt(j));
            }

            for (int k = i + 1; k < N; k++) {
                Set<Character> Y = new HashSet<>();
                for (int l = k; l < N; l++) {
                    Y.add(S.charAt(l));
                }

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