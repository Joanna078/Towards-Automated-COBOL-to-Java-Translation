import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] parts = ln.split(" ");
        String s = parts[0];
        String t = parts[1];
        System.out.println(t.trim() + " " + s.trim());
    }
}