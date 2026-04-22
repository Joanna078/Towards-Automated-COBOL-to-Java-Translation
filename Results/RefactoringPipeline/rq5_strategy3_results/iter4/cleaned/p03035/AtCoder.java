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
        temp1--;
        long A = Long.parseLong(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        long B = Long.parseLong(inp.substring(temp1, temp2));

        long E;
        if (A >= 13) {
            E = B;
        } else if (A >= 6) {
            E = B / 2;
        } else {
            E = 0;
        }

        System.out.println(E);
    }
}