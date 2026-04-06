import java.util.Scanner;

public class SORTNUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = 1; b < N; b++) {
                for (int c = 1; c < N; c++) {
                    int res = a * b + c;

                    if (res > N) {
                        break;
                    }

                    if (res == N) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
