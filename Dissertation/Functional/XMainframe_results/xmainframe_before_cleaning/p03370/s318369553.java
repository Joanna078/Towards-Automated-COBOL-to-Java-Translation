import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] INP = sc.nextLine().split(" ");
        int sm = 0;
        int mn = 1001;
        for (int i = 0; i < 2; i++) {
            int x = Integer.parseInt(INP[i]);
            sm += x;
            if (x < mn) {
                mn = x;
            }
        }
        System.out.println(sm - mn);
    }
}