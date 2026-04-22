import java.util.Scanner;
import java.util.Arrays;

public class ABC_103_D {

    private static final int MAX_AB_COUNT = 100000;
    private static final Scanner scanner = new Scanner(System.in);

    private int N;
    private int M;
    private int[][] ab = new int[MAX_AB_COUNT][2];
    private int done;
    private int cnt;
    private String ans;

    public static void main(String[] args) {
        ABC_103_D program = new ABC_103_D();
        program.execute();
    }

    private void execute() {
        acceptInput();
        parseInput();
        sortAb();
        processAb();
        formatOutput();
        displayResult();
    }

    private void acceptInput() {
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        N = Integer.parseInt(parts[0]);
        M = Integer.parseInt(parts[1]);

        for (int i = 0; i < M; i++) {
            inp = scanner.nextLine();
            parts = inp.split("\\s+");
            ab[i][0] = Integer.parseInt(parts[0]);
            ab[i][1] = Integer.parseInt(parts[1]);
        }
    }

    private void parseInput() {
        // No additional parsing needed after initial input
    }

    private void sortAb() {
        Arrays.sort(ab, 0, M, (a, b) -> Integer.compare(a[1], b[1]));
    }

    private void processAb() {
        done = 0;
        cnt = 0;

        for (int i = 0; i < M; i++) {
            if (done < ab[i][0]) {
                cnt++;
                done = ab[i][1] - 1;
            }
        }
    }

    private void formatOutput() {
        ans = String.format("%06d", cnt);
    }

    private void displayResult() {
        System.out.println(ans.trim());
    }
}