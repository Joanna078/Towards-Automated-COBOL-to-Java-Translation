import java.util.Scanner;

public class AKthTerm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = scanner.nextInt();
        scanner.close();

        String tbl = "0101010201020105020201050102011401050105020201150202050401040151";
        int out = Integer.parseInt(tbl.substring(2 * (k - 1), 2 * k));

        System.out.println(out);
    }
}