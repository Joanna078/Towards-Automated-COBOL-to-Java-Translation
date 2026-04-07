import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int x = a + b + c;
        int q = x / 2;
        int r = x % 2;
        if (r == 1) {
            System.out.println("No");
        } else {
            if (a == q || b == q || c == q) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}