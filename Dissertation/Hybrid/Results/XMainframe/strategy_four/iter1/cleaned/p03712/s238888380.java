import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] hw = inp.split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        StringBuilder ln = new StringBuilder("#");

        for (int i = 0; i < w + 2; i++) {
            ln.append("#");
        }
        System.out.println(ln.toString());

        for (int i = 0; i < h; i++) {
            String a = sc.nextLine();
            ln.setLength(1); // Reset to just "#"
            ln.append(a).append("#");
            System.out.println(ln.toString());
        }

        ln.setLength(1); // Reset to just "#"
        for (int i = 0; i < w + 2; i++) {
            ln.append("#");
        }
        System.out.println(ln.toString());
    }
}