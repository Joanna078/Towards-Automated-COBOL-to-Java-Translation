import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int S = Integer.parseInt(arr[0]);
        int W = Integer.parseInt(arr[1]);
        System.out.println(W < S ? "safe" : "unsafe");
    }
}
