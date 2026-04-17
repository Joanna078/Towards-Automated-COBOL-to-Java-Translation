import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine().trim();

        if ("Sunny".equals(indata)) {
            System.out.println("Cloudy");
        } else if ("Cloudy".equals(indata)) {
            System.out.println("Rainy");
        } else if ("Rainy".equals(indata)) {
            System.out.println("Sunny");
        }
    }
}