import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        
        if (inp.length() != 3) {
            System.out.println("Input must be exactly 3 characters.");
        } else {
            char s1 = inp.charAt(0);
            char s2 = inp.charAt(1);
            char s3 = inp.charAt(2);

            if ((s1 == s2) && (s1 == s3)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}