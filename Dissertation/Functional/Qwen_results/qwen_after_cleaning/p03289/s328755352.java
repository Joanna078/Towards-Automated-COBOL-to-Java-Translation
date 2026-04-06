import java.util.Scanner;

public class ABC_100_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();

        if (s.charAt(0) == 'A') {
            int cnt = 0;
            int idx = 99;
            for (int i = 2; i < len; i++) {
                if (s.charAt(i) == 'C') {
                    cnt++;
                    idx = i;
                }
            }

            if (cnt == 1) {
                boolean flg = false;
                for (int i = 1; i < len; i++) {
                    if (i != idx) {
                        char chr = s.charAt(i);
                        if (chr < 'a' || chr > 'z') {
                            flg = true;
                            break;
                        }
                    }
                }

                if (flg) {
                    System.out.println("WA");
                } else {
                    System.out.println("AC");
                }

            } else {
                System.out.println("WA");
            }

        } else {
            System.out.println("WA");
        }
    }
}