import java.util.Arrays;

public class ABC110B {
    public static void main(String[] args) {
        String input = System.console().readLine();
        String[] parts = input.split(" ");
        
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int x = Integer.parseInt(parts[2]);
        int y = Integer.parseInt(parts[3]);
        
        input = System.console().readLine();
        parts = input.split(" ");
        
        int[] array = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        
        input = System.console().readLine();
        parts = input.split(" ");
        
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            int t = array[ptr++];
            if (x < t) {
                x = t;
            }
        }
        
        input = System.console().readLine();
        parts = input.split(" ");
        
        ptr = 0;
        for (int i = 0; i < m; i++) {
            int t = array[ptr++];
            if (t < y) {
                y = t;
            }
        }
        
        if (x < y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}