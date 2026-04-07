import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] AB = new int[2];
        for (int i = 0; i < 2; i++) {
            AB[i] = sc.nextInt();
        }
        System.out.println(Math.max(AB[0] + AB[1], Math.max(AB[0] - AB[1], AB[0] * AB[1])));
    }
}