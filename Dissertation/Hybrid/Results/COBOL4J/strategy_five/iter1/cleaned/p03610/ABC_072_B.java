import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ABC_072_B {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            StringBuilder ln = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int m = i % 2;
                if (m == 0) {
                    ln.append(s.charAt(i));
                }
            }
            System.out.println(ln.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}