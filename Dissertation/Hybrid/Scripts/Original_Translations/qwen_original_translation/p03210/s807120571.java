import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        int a1 = Integer.parseInt(indata.split(" ")[0]);

        if (a1 == 3 || a1 == 5 || a1 == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}