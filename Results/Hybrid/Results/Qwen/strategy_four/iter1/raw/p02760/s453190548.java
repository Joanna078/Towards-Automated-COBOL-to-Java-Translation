```java
import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inp = scanner.nextLine();
        int num = 3; // Fixed value from the COBOL code
        int n = Integer.parseInt(scanner.nextLine());
        int[] y = new int[100];
        Arrays.fill(y, -1);
        int[] x = new int[100];
        Arrays.fill(x, -1);
        int[] tate = new int[3];
        Arrays.fill(tate, 0);
        int[] yoko = new int[3];
        Arrays.fill(yoko, 0);
        int[] naname = new int[2];
        Arrays.fill(naname, 0);
        int cur = 1;
        int i = 1;
        int j;
        int jix = 1;
        int len;
        int nm;
        int ans = 0;
        int flg = 0;

        while (i <= num) {
            j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            nm = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            y[nm] = i;
            x[nm] = jix;
            cur = j + 1;
            jix++;
            i++;
        }

        i = 1;
        while (i <= n) {
            nm = Integer.parseInt(scanner.nextLine());
            if (y[nm] != -1) {
                yoko[y[nm]]++;
                if (num == yoko[y[nm]]) {
                    flg = 1;
                    break;
                }
                tate[x[nm]]++;
                if (num == tate[x[nm]]) {
                    flg = 1;
                    break;
                }
                if (y[nm] == x[nm]) {
                    naname[0]++;
                    if (num == naname[0]) {
                        flg = 1;
                        break;
                    }
                }
                if (y[nm] == num - x[nm] + 1) {
                    naname[1]++;
                    if (num == naname[1]) {
                        flg = 1;
                        break;
                    }
                }
            }
            i++;
        }

        if (flg == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```