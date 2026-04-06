import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_ID {
    public static void main(String[] args) throws IOException {
        // Read a character from standard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char c = (char) reader.read();

        // Convert the character by incrementing its ASCII value
        char convertedChar = (char) (Character.toUpperCase(c) - 1);

        // Print the converted character to standard output
        System.out.println(convertedChar);
    }
}