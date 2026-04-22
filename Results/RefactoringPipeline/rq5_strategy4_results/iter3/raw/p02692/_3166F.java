```java
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int[] abc = {Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3])};
        String s1 = scanner.nextLine();
        String out = "Yes";
        char[] o = new char[n];

        for (int i = 0; i < n; i++) {
            String s2 = i == n - 1 ? "  " : scanner.nextLine();

            int j1 = getJ(s1, 0), j2 = getJ(s1, 1);

            if (abc[j1] == 0 && abc[j2] == 0) {
                out = "No ";
            } else if (abc[j1] > abc[j2]) {
                int temp = j1;
                j1 = j2;
                j2 = temp;
            } else if (abc[j1] == 1 && abc[j2] == 1) {
                int j3 = getJ(s2, 0), j4 = getJ(s2, 1);

                if (j1 != j3 && j2 == j4) {
                    int temp = j1;
                    j1 = j2;
                    j2 = j4;
                } else if (j1 != j3) {
                    int temp = j1;
                    j1 = j2;
                    j2 = j3;
                }
            }

            abc[j1]++;
            abc[j2]--;
            o[i] = "ABC".charAt(j1);
            s1 = s2;
        }

        System.out.println(out.trim());

        if ("Yes".equals(out)) {
            for (char c : o) {
                System.out.println(c);
            }
        }
    }

    private static int getJ(String s, int index) {
        switch (s) {
            case "AB": return index == 0 ? 0 : 1;
            case "AC": return index == 0 ? 0 : 2;
            case "BC": return index == 0 ? 1 : 2;
            default: return -1;
        }
    }
}
```