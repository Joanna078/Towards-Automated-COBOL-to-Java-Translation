import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = N / 3;
        String ZS = String.format("%d", tmp);
        String[] parts = ZS.split("");
        if (parts.length > 1) {
            System.out.println(parts[1]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}