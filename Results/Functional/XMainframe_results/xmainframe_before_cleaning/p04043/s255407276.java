import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = sc.nextInt();
        }
        int five = 0;
        int seven = 0;
        for (int num : ABC) {
            if (num == 5) five++;
            else if (num == 7) seven++;
        }
        System.out.println(five == 2 && seven == 1 ? "YES" : "NO");
    }
}