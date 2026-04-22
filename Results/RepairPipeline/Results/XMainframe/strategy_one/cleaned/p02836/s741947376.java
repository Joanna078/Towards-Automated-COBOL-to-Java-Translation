import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String s = "";
        int n = 0;
        String[] parts = inp.split(" ");
        s = parts[0];
        n = Integer.parseInt(parts[1]);
        int h = 0;
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                h++;
            }
        }
        System.out.println(h);
    }
}