import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int num = Integer.parseInt(N);
        int sn = 0;
        for (int i = 0; i < N.length(); i++) {
            sn += Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        if (num % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
