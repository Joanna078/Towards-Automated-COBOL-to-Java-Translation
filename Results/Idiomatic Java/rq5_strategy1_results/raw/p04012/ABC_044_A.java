```java
import java.util.Scanner;

public class ABC_044_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private char a = ' ';
    private char chr = ' ';
    private String w = "";
    private int len = 0;
    private int i = 0;
    private int[] cnt1 = new int[26];
    private char tmp = '0';
    private char flg = '0';

    public static void main(String[] args) {
        new ABC_044_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        w = scanner.nextLine();
        len = w.length();
        a = 'a';
        for (int i = 0; i < 26; i++) {
            cnt1[i] = 0;
        }
        tmp = '0';
        flg = '0';

        for (i = 0; i < len; i++) {
            chr = w.charAt(i);
            cnt1[chr - 'a']++;
        }

        for (i = 0; i < 26; i++) {
            if (cnt1[i] % 2 != 0) {
                flg = '1';
                break;
            }
        }

        if (flg == '0') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```