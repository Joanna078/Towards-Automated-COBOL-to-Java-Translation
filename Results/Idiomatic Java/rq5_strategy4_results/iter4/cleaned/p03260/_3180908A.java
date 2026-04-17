import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three characters:");
        char[] input = scanner.nextLine().toCharArray();

        String ans = "No";
        for (int idx = 1; idx <= 3; idx++) {
            int wA = Character.getNumericValue(input[0]);
            int wB = Character.getNumericValue(input[2]);
            int wVal = wA * wB * idx;
            int rem = wVal % 2;

            if (rem == 1) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);
    }
}