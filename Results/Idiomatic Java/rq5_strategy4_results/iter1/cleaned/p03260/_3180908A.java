import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three characters:");
        char[] input = scanner.nextLine().toCharArray();

        char ans = 'N';
        for (int idx = 1; idx <= 3; idx++) {
            int wA = input[0] - '0';
            int wB = input[2] - '0';
            int wVal = wA * wB * idx;
            int wShow = wVal / 2;
            int rem = wVal % 2;

            if (rem == 1) {
                ans = 'Y';
                break;
            }
        }

        System.out.println(ans == 'Y' ? "Yes" : "No");
    }
}