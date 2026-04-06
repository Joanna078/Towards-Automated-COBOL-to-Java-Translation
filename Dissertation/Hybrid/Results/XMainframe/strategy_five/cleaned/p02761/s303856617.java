import java.util.*;

public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int n = Integer.parseInt(input1.split(" ")[0]);
        int m = Integer.parseInt(input1.split(" ")[2]);
        List<Integer> tn = new ArrayList<>(Collections.nCopies(n, null));
        boolean swErr = false;

        for (int i = 0; i < m; i++) {
            String input2 = scanner.nextLine();
            int s = Integer.parseInt(input2.split(" ")[0]);
            int c = Integer.parseInt(input2.split(" ")[2]);
            if (s > 0 && s <= n && tn.get(s - 1) == null) {
                if (c == 0 && s == 1 && n > 1) {
                    swErr = true;
                } else {
                    tn.set(s - 1, c);
                }
            } else if (s > 0 && s <= n && tn.get(s - 1) != c) {
                swErr = true;
            }
        }

        if (swErr) {
            System.out.println(-1);
        } else {
            if (n > 1 && tn.get(0) == null) {
                tn.set(0, 1);
            }

            for (int i = 0; i < n; i++) {
                if (tn.get(i) == null) {
                    tn.set(i, 0);
                }
            }

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < n; i++) {
                output.append(tn.get(i));
            }
            System.out.println(output.toString());
        }
    }
}