import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        int A = Integer.parseInt(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        int B = Integer.parseInt(inp.substring(temp1, temp2));

        int E = A >= 13 ? B : (A >= 6 ? B / 2 : 0);

        System.out.println(E);
    }
}