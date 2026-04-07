import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;

        String a = inp.substring(0, temp1);

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }

        int n = temp2 - temp1;
        String b = inp.substring(temp1, temp1 + n);

        temp2++;
        temp1 = temp2;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }

        n = temp1 - temp2;
        String c = inp.substring(temp2, temp2 + n);

        System.out.println("A" + b.charAt(0) + "C");
    }
}