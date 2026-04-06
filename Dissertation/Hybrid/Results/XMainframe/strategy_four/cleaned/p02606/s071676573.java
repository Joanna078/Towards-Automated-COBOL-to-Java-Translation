import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int l = Integer.parseInt(input.split(" ")[0]);
        int r = Integer.parseInt(input.split(" ")[1]);
        int d = Integer.parseInt(input.split(" ")[2]);
        int count = 0;
        if (d == 1) {
            count = r - d + 1;
        } else {
            for (int i = 1; d * i <= r; i++) {
                if (d * i >= l) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}