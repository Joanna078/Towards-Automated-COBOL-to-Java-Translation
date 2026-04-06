import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        String s = sc.nextLine();
        int sm = 0;
        int cnt = 1;
        int prev = Character.getNumericValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) { 
            if (prev != Character.getNumericValue(s.charAt(i))) {
                sm += cnt / 2;
                prev = Character.getNumericValue(s.charAt(i));
                cnt = 1;
            } else {
                cnt++;
            }
        }
        sm += cnt / 2; // Add this line to handle the last sequence
        System.out.printf("%03d%n", sm); // Ensure output is always 3 digits
    }
}