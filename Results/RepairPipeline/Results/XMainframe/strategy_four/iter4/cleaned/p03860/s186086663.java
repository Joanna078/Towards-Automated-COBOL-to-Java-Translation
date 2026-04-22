import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int temp1 = 0;
        int temp2 = 0;
        int n = 0;
        String a = "";
        String b = "";
        String c = "";

        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                break;
            }
            temp1++;
        }

        a = inp.substring(0, temp1);

        temp1 += 2;

        for (int i = temp1; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                break;
            }
            temp2++;
        }

        n = temp2 - temp1;
        b = inp.substring(temp1, temp1 + n);

        temp2 += 1;

        for (int i = temp2; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                break;
            }
            temp1++;
        }

        n = temp1 - temp2;
        c = inp.substring(temp2, temp2 + n);

        System.out.println("A: " + a);
        System.out.println(b.charAt(0) + ": " + b.substring(1));
        System.out.println("C: " + c);
    }
}