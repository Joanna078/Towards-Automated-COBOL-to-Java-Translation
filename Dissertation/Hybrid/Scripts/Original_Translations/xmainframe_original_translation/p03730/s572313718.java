import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int num = a;
        int flg = 0;
        int i;
        for (i = 1; a * b > num; i++) {
            if (num % b == c) {
                flg = 1;
                break;
            } else {
                num = a * i;
            }
        }
        if (flg == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
