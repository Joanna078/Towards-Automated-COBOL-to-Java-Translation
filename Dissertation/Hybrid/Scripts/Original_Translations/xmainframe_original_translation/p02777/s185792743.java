import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String s = line1.split(" ")[0];
        String t = line1.split(" ")[1];
        int a = Integer.parseInt(line2.split(" ")[0]);
        int b = Integer.parseInt(line2.split(" ")[1]);
        String u = sc.nextLine();
        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }
        System.out.println(a + " " + b);
    }
}
