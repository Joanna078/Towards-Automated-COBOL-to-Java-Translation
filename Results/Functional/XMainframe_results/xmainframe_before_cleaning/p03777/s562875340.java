import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = input.split(" ")[0];
        String b = input.split(" ")[1];

        if (a.equals("H")) {
            if (b.equals("H")) {
                System.out.println("H");
            } else {
                System.out.println("D");
            }
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}