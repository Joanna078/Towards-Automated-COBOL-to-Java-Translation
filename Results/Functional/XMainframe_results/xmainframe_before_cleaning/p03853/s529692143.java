import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        String[] hw = inp.split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        StringBuilder c;
        for (int i = 0; i < h; i++) {
            c = new StringBuilder(reader.readLine());
            System.out.println(c);
            System.out.println(c);
        }
    }
}