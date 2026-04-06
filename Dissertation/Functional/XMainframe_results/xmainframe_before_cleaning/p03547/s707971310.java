import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String x = inp.split(" ")[0];
        String y = inp.split(" ")[1];
        if (x.compareTo(y) < 0) {
            System.out.println("<");
        } else if (x.equals(y)) {
            System.out.println("=");
        } else {
            System.out.println(">");
        }
    }
}