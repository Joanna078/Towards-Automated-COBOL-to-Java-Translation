import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int i = Integer.parseInt(parts[1]);
        int result = n - i;
        if (result < 1) {
            result = 1;
        } else if (result > 100) {
            result = 100;
        }
        System.out.println(result);
    }
}
