import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);
        long C = Long.parseLong(arr[2]);
        long K = Long.parseLong(arr[3]);
        if (K <= A) {
            System.out.println(K);
        } else if (K <= A + B) {
            System.out.println(A);
        } else {
            System.out.println(A - (K - A - B));
        }
    }
}