import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramID {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char c = (char) reader.read();
            char nextChar = (char) (c + 1);
            System.out.print(nextChar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}