import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int k = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        int count = 0;

        for (int i = 0; i <= 3 * k; i++) {
            if (k < i) break;

            for (int j = 0; j <= 3 * k; j++) {
                if (k < j) break;

                int sum = i + j;
                if (sum <= s && s - sum <= k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
