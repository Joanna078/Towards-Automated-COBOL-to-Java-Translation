import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}