import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String str = "";
        int p = 1;
        while (N != 0) {
            if (N % 2 == 1) {
                N--;
                str = "1" + str;
            } else {
                str = "0" + str;
            }
            N /= -2;
        }
        if (str.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(str);
        }
    }
}