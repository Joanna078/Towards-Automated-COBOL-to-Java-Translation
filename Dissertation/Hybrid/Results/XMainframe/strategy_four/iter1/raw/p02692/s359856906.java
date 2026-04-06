```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int[] abc = new int[3];
        abc[0] = Integer.parseInt(line.split(" ")[1]);
        abc[1] = Integer.parseInt(line.split(" ")[2]);
        abc[2] = Integer.parseInt(line.split(" ")[3]);
        char[] o = new char[100000];
        String inp = reader.readLine();
        String s1 = "";
        String s2 = "";
        String out = "Yes";
        int i = 0;
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        int j4 = 0;
        String cAbc = "ABC";

        while (i <= n) {
            if (i == n) {
                s2 = "  ";
            } else {
                s2 = reader.readLine().trim();
            }
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
                default:
                    break;
            }

            if ((abc[j1] == 0) && (abc[j2] == 0)) {
                out = "No ";
            } else if (abc[j1] < abc[j2]) {
                continue;
            } else if (abc[j1] > abc[j2]) {
                j3 = j2;
                j2 = j1;
                j1 = j3;
            } else if ((abc[j1] == 1) && (abc[j2] == 1)) {
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
                    default:
                        break;
                }

                if (j1 == j3) {
                    continue;
                } else if (j2 == j4) {
                    j2 = j1;
                    j1 = j4;
                } else {
                    j2 = j1;
                    j1 = j3;
                }
            } else {
                continue;
            }

            abc[j1]++;
            abc[j2]--;
            o[i] = cAbc.charAt(j1);
            s1 = s2;
            i++;
        }

        System.out.println(out.trim());

        if (out.equals("Yes")) {
            for (int k = 0; k < n; k++) {
                System.out.print(o[k]);
            }
        }
    }
}
```