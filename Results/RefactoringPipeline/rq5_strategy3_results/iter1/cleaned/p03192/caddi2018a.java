import java.util.Scanner;

public class Caddi2018a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int countOfTwos = countTwos(input);
        System.out.println("Number of '2's: " + countOfTwos);
    }

    private static int countTwos(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == '2') {
                count++;
            }
        }
        return count;
    }
}