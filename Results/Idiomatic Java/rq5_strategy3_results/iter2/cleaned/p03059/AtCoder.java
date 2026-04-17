import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        long A = Long.parseLong(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        long B = Long.parseLong(inp.substring(temp1, temp2));

        temp2 += 1;
        int temp3 = temp2;
        while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
            temp3++;
        }
        long C = Long.parseLong(inp.substring(temp2, temp3));

        if (A != 0) {
            C /= A;
            C *= B;
        }

        System.out.printf("%010d%n", C);
    }
}