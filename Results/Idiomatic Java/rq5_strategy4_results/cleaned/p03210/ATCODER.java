import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        if (parts.length > 0) {
            int a1 = Integer.parseInt(parts[0]);
            if (a1 == 3 || a1 == 5 || a1 == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}