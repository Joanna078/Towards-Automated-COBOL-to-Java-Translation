import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int i = Integer.parseInt(parts[1]);
        i = n - i + 1;
        if (i < 1) {
            i = 1;
        } else if (i > 100) {
            i = 100;
        }
        System.out.printf("%3d%n", i);
    }
}