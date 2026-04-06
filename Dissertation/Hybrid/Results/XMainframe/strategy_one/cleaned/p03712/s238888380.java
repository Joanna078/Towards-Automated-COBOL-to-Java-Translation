import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] hw = inp.split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        System.out.println("#".repeat(w));
        for (int i = 0; i < h - 2; i++) {
            System.out.println("#" + " ".repeat(w - 2) + "#");
        }
        System.out.println("#".repeat(w));
    }
}