import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NomuraB {
    public static void main(String[] args) throws Exception {
        // Open input stream from keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read input into string T
        String t = reader.readLine();
        
        // Close the input stream
        reader.close();
        
        // Initialize output string OUT with the same content as T
        String out = t;
        
        // Replace all '?' characters in OUT with 'D'
        out = out.replace('?', 'D');
        
        // Trim leading/trailing whitespace and display the result
        System.out.println(out.trim());
    }
}