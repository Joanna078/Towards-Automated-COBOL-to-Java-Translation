import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int NOW1 = 0, NOW2 = 0, NOW3 = 0;

        for (int T = 1; T <= S; T++) {
            String INP = scanner.next();

            int temp1 = 0;
            while (temp1 < INP.length() && INP.charAt(temp1) != ' ') {
                temp1++;
            }
            int A = Integer.parseInt(INP.substring(0, temp1));

            temp1 += 2;
            int temp2 = temp1;
            while (temp2 < INP.length() && INP.charAt(temp2) != ' ') {
                temp2++;
            }
            int N = temp2 - temp1;
            int B = Integer.parseInt(INP.substring(temp1, temp1 + N));

            temp1 += 1;
            temp2 = temp1;
            while (temp2 < INP.length() && INP.charAt(temp2) != ' ') {
                temp2++;
            }
            N = temp2 - temp1;
            int C = Integer.parseInt(INP.substring(temp1, temp1 + N));

            int temp3 = A - NOW1;
            int temp4 = B - NOW2;
            int temp5 = C - NOW3;
            temp4 += temp5;

            if (temp3 < temp4) {
                System.out.println("No");
                return;
            }

            temp4 = temp3 / 2;
            temp3 = temp3 - temp4 * 2;
            temp4 = B - NOW2;
            temp5 = temp4 / 2;
            temp4 = temp4 - temp5 * 2;
            temp5 = C - NOW3;
            int temp6 = temp5 / 2;
            temp5 = temp5 - temp6 * 2;
            temp4 += temp5;
            temp4 -= 2;

            if (temp4 == 2) {
                temp4 = 0;
            }

            if (temp3 != temp4) {
                System.out.println("No");
                return;
            }

            NOW1 = A;
            NOW2 = B;
            NOW3 = C;
        }

        System.out.println("Yes");
    }
}