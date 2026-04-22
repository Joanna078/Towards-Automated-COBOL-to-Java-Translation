```java
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int[] abc = {Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3])};
        String s1 = scanner.nextLine();
        String out = "Yes";
        char[] o = new char[n];

        for (int i = 0; i < n; i++) {
            String s2;
            if (i == n - 1) {
                s2 = "  ";
            } else {
                s2 = scanner.nextLine();
            }

            int j1 = 0, j2 = 0;
            switch (s1) {
                case "AB":
                    j1 = 0;
                    j2 = 1;
                    break;
                case "AC":
                    j1 = 0;
                    j2 = 2;
                    break;
                case "BC":
                    j1 = 1;
                    j2 = 2;
                    break;
            }

            if (abc[j1] == 0 && abc[j2] == 0) {
                out = "No ";
            } else if (abc[j1] < abc[j2]) {
                // Continue
            } else if (abc[j1] > abc[j2]) {
                int temp = j2;
                j2 = j1;
                j1 = temp;
            } else if (abc[j1] == 1 && abc[j2] == 1) {
                int j3 = 0, j4 = 0;
                switch (s2) {
                    case "AB":
                        j3 = 0;
                        j4 = 1;
                        break;
                    case "AC":
                        j3 = 0;
                        j4 = 2;
                        break;
                    case "BC":
                        j3 = 1;
                        j4 = 2;
                        break;
                }

                if (j1 == j3) {
                    // Continue
                } else if (j2 == j4) {
                    int temp = j1;
                    j1 = j2;
                    j2 = j4;
                } else {
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
            for (int i = 0; i < n; i++) {
                System.out.println(o[i]);
            }
        }
    }
}
```