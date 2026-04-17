import java.util.Scanner;

public class ABC_044_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        scanner.close();

        int len = w.length();
        char a = 'a';
        int[] cnt = new int[26];

        for (int i = 0; i < len; i++) {
            char chr = w.charAt(i);
            int index = chr - a;
            if (index >= 0 && index < 26) {
                cnt[index]++;
            }
        }

        boolean flg = false;
        for (int count : cnt) {
            if (count % 2 != 0) {
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