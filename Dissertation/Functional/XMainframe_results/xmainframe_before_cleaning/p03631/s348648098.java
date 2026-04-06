import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String r = scanner.nextLine();

        if (r.charAt(0) == r.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}