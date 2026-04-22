import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int temp1 = 0;
        while (temp1 < input.length() && input.charAt(temp1) != ' ') {
            temp1++;
        }
        temp1--;
        int A = Integer.parseInt(input.substring(0, temp1).trim());

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < input.length() && input.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        int B = Integer.parseInt(input.substring(temp1, temp1 + N).trim());

        temp2++;
        temp1 = temp2;
        while (temp1 < input.length() && input.charAt(temp1) != ' ') {
            temp1++;
        }
        N = temp1 - temp2;
        int C = Integer.parseInt(input.substring(temp2, temp2 + N).trim());

        if (A == B && B != C) {
            System.out.println(2);
        } else if (A != B && B == C) {
            System.out.println(2);
        } else if (A == C && B != C) {
            System.out.println(2);
        } else if (A == C && B == C) {
            System.out.println(1);
        } else {
            System.out.println(3);
        }
    }
}