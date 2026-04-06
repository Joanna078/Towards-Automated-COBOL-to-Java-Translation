import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] hw = inp.split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        for (int i = 0; i < h; i++) {
            System.out.print("#");
            for (int j = 0; j < w - 2; j++) {
                System.out.print(sc.next());
            }
            System.out.println("#");
        }
    }
}