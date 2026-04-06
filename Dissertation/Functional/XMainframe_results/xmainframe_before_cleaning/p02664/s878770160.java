import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NomuraB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = reader.readLine();
        reader.close();

        String out = t;
        out = out.replaceAll("\\?", "D");

        System.out.println(out.trim());
    }
}