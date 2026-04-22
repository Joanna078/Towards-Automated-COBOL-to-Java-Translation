import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String arare = reader.readLine();
        String ans = "Three";
        n *= 2;
        n--;
        while (n >= 0) {
            if (arare.charAt(n) == 'Y') {
                ans = "Four";
                break;
            }
            n--;
        }
        System.out.println(ans.trim());
    }
}