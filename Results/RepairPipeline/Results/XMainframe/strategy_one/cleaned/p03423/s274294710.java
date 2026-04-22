import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = N / 3;
        String ZS = String.format("%d", tmp);
        String[] parts = ZS.split("");
        System.out.println(parts[0]);
    }
}