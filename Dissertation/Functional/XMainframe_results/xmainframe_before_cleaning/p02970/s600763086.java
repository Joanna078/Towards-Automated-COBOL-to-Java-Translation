import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int D = Integer.parseInt(arr[1]);
        System.out.println((N + 2 * D) / (2 * D + 1));
    }
}