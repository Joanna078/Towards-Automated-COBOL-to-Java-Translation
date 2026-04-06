import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        StringBuilder str = new StringBuilder();
        while (N != 0) {
            if (N % 2 == 1) {
                N--;
                str.append("1");
            } else {
                str.append("0");
            }
            N /= -2;
        }
        if (str.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(str.reverse().toString());
        }
    }
}