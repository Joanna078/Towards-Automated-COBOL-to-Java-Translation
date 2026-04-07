import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int w = Integer.parseInt(arr[0]);
        int a = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }
        int sum = w + a;
        if (b < sum) {
            System.out.println(0);
        } else {
            int diff = b - sum;
            System.out.println(diff);
        }
    }
}
