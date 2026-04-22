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

        boolean flag = false;
        for (int count : cnt) {
            if (count % 2 != 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}