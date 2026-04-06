import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] parts = inp.split(" ");
        int x = Integer.parseInt(parts[0]);
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        a -= x;
        b -= x;
        if (a < b) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}