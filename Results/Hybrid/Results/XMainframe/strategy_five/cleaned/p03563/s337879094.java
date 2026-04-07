import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int diff = G - R;
        int sum = diff + G;
        String result = Integer.toString(sum);
        System.out.println(result);
    }
}