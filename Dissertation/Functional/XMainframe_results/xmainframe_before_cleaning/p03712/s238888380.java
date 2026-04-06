import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] hw = inp.split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        System.out.println("#");
        for (int i = 0; i < h - 2; i++) {
            System.out.println("#" + sc.nextLine() + "#");
        }
        System.out.println("#");
        for (int i = 0; i < h - 2; i++) {
            System.out.println("#" + sc.nextLine() + "#");
        }
        System.out.println("#");
    }
}