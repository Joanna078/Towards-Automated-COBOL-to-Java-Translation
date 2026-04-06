import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(new String(new char[400000]).replace('\0', ' ')); // Initialize with spaces
        s.append(reader.readLine()); // Accept S
        int pos2 = s.length();
        int pos1 = 1 + 200000;
        pos2 = pos2 + 200000;
        
        int q = Integer.parseInt(reader.readLine());
        String inp;
        int t, f;
        char c, w;
        
        while (q-- > 0) {
            inp = reader.readLine();
            String[] parts = inp.split(" ");
            t = Integer.parseInt(parts[0]);
            f = Integer.parseInt(parts[1]);
            c = parts[2].charAt(0);
            
            if (t == 1) {
                char temp = s.charAt(pos1 - 1);
                s.setCharAt(pos1 - 1, s.charAt(pos2 - 1));
                s.setCharAt(pos2 - 1, temp);
            } else if (f == 1) {
                --pos1;
                s.setCharAt(pos1 - 1, c);
            } else {
                ++pos2;
                s.setCharAt(pos2 - 1, c);
            }
        }
        System.out.println(s.substring(pos1 - 1, pos2 - 1 + 1).trim());
    }
}