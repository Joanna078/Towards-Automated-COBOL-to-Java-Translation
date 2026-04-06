import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int a = Integer.parseInt(inp.substring(0, inp.indexOf(" ")));
        int b = Integer.parseInt(inp.substring(inp.indexOf(" ") + 1, inp.lastIndexOf(" ")));
        int c = Integer.parseInt(inp.substring(inp.lastIndexOf(" ") + 1));
        int ren = 0;
        for (int i = 1; i <= a; i++) {
            if (i >= b && i <= c) {
                ren += i;
            }
        }
        System.out.println(ren);
    }
}