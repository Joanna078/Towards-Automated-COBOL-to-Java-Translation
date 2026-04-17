```java
import java.util.Scanner;

public class ABC_044_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        scanner.close();

        int len = w.length();
        int[] cnt = new int[26];
        char a = 'a';

        for (int i = 0; i < len; i++) {
            char chr = w.charAt(i);
            if (Character.isLetter(chr)) {
                int index = Character.toLowerCase(chr) - a;
                cnt[index]++;
            }
        }

        boolean flg = false;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 != 0) {
                flg = true;
                break;
            }
        }

        if (!flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```