import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int out;
        if (s.equals("RRR")) {
            out = 3;
        } else if (s.substring(0, 2).equals("RR") || s.substring(1, 3).equals("RR")) {
            out = 2;
        } else if (s.charAt(0) == 'R' || s.charAt(1) == 'R' || s.charAt(2) == 'R') {
            out = 1;
        } else {
            out = 0;
        }
        System.out.println(out);
    }
}
