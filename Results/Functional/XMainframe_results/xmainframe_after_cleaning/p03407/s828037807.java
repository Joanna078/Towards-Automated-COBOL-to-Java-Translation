import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = sc.nextInt();
        }
        Arrays.sort(ABC);
        if (ABC[2] < ABC[0] + ABC[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
