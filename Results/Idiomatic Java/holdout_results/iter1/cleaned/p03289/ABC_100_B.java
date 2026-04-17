import java.util.Scanner;

public class ABC_100_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        int len = s.length();
        int cnt = 0;
        int idx = -1;

        if (s.charAt(0) == 'A') {
            for (int i = 2; i < len; i++) {
                if (s.charAt(i) == 'C') {
                    cnt++;
                    idx = i;
                }
            }

            if (cnt == 1) {
                boolean flag = false;
                for (int i = 1; i < len; i++) {
                    if (i != idx && !Character.isLetter(s.charAt(i))) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
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