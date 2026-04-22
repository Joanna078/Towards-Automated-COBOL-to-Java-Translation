import java.util.Arrays;
import java.util.Scanner;

public class ABC_042_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String inp = scanner.nextLine();
        
        // Unstring input into N and L
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int L = Integer.parseInt(parts[1]);
        
        // Array to hold strings S
        String[] S = new String[N];
        
        // Accept each string S(i)
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextLine();
        }
        
        // Sort the array S
        Arrays.sort(S);
        
        // Construct the answer string
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            ans.append(S[i].substring(0, L));
        }
        
        // Display the result
        System.out.println(ans.toString());
        
        scanner.close();
    }
}