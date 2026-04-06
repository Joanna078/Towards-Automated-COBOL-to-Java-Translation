import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) { // Change from 1 to 0 to match COBOL logic
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}