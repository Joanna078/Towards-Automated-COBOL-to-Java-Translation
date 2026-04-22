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

        int a = Integer.parseInt(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int n = temp2 - temp1;
        int b = Integer.parseInt(inp.substring(temp1, temp2));

        int c = a * b;

        if (a <= 9 && b <= 9) {
            System.out.println(c);
        } else {
            System.out.println("-1");
        }
    }
}