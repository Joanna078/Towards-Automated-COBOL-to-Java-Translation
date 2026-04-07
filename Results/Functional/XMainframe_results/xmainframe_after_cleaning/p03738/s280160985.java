import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int len = 101;
        StringBuilder strA = new StringBuilder();
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < len - A.length(); i++) {
            strA.append('0');
        }
        strA.append(A);
        for (int i = 0; i < len - B.length(); i++) {
            strB.append('0');
        }
        strB.append(B);
        if (strA.toString().compareTo(strB.toString()) > 0) {
            System.out.println("GREATER");
        } else if (strA.toString().compareTo(strB.toString()) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }
    }
}
