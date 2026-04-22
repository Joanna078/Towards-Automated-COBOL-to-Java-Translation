import java.util.Scanner;

public class ABC_065_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();

        // Initialize arrays
        int[] ary = new int[N];
        boolean[] flg = new boolean[N];

        // Accept N values and store in ary
        for (int i = 0; i < N; i++) {
            ary[i] = scanner.nextInt();
        }

        // Set flag for the first element
        flg[0] = true;

        int now = 0;
        int cnt = 0;
        boolean foundTwo = false;

        // Traverse the array based on the values
        while (now < N && !flg[ary[now]]) {
            cnt++;
            now = ary[now];
            flg[now] = true;
            if (now == 1) {
                foundTwo = true;
                break;
            }
        }

        // If the loop completed without finding 2, set cnt to -1
        if (!foundTwo) {
            cnt = -1;
        }

        // Display the result
        System.out.println(cnt);
    }
}