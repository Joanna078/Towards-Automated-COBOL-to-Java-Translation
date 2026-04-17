import java.util.Scanner;

public class ATCODER {

    private static final String SUNNY = "Sunny";
    private static final String CLOUDY = "Cloudy";
    private static final String RAINY = "Rainy";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        switch (input) {
            case SUNNY:
                System.out.println(CLOUDY);
                break;
            case CLOUDY:
                System.out.println(RAINY);
                break;
            case RAINY:
                System.out.println(SUNNY);
                break;
            default:
                System.out.println("Unknown weather condition");
                break;
        }
    }
}