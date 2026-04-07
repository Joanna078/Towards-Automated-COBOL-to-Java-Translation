import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String inp = sc.nextLine(); // Change from next() to nextLine()
        String[] arr = inp.trim().split(" "); // Add trim() to remove leading/trailing spaces
        if (arr.length < 2) { // Check if there are at least two elements
            System.out.println("NG");
            return;
        }
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int s1 = a / k;
        int s2 = b / k;
        int a1 = a % k;
        int a2 = b % k;
        if (((s1 >= 1) && (s2 > 1)) ||
            ((a1 == 0) && (a > k))) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}