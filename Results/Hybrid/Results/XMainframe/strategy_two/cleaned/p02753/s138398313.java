import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s1 = sc.next();
            if (sc.hasNext()) {
                String s2 = sc.next();
                if (sc.hasNext()) {
                    String s3 = sc.next();
                    if ((s1.equals(s2)) && (s1.equals(s3))) {
                        System.out.println("No");
                    } else {
                        System.out.println("Yes");
                    }
                } else {
                    System.out.println("No input for s3");
                }
            } else {
                System.out.println("No input for s2");
            }
        } else {
            System.out.println("No input for s1");
        }
        sc.close();
    }
}