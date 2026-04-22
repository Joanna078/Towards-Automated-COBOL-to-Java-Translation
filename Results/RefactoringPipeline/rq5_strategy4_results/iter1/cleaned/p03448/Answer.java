import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();

        int ans = 0;

        // Iterate over all possible combinations of i, j, k
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int tmp1 = i * 500 + j * 100 + k * 50;
                    if (tmp1 == x) {
                        ans++;
                    }
                }
            }
        }

        // Display the result
        System.out.println(ans);
    }
}