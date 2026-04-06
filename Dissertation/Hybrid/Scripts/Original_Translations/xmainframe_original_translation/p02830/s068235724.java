import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next(), t = scanner.next();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st.append(s.charAt(i));
            st.append(t.charAt(i));
        }
        System.out.println(st.toString());
    }
}
