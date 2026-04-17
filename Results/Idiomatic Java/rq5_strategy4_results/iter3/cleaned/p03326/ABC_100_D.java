import java.util.Arrays;
import java.util.Scanner;

public class ABC_100_D {

    private int N;
    private int M;
    private int[] c000 = new int[1000];
    private int[] c001 = new int[1000];
    private int[] c010 = new int[1000];
    private int[] c100 = new int[1000];
    private int[] c011 = new int[1000];
    private int[] c101 = new int[1000];
    private int[] c110 = new int[1000];
    private int[] c111 = new int[1000];
    private long cake000;
    private long cake001;
    private long cake010;
    private long cake100;
    private long cake011;
    private long cake101;
    private long cake110;
    private long cake111;
    private String ans;

    public static void main(String[] args) {
        ABC_100_D program = new ABC_100_D();
        program.run();
    }

    public void run() {
        acceptInput();
        processInput();
        sortArrays();
        calculateSums();
        findMax();
        displayResult();
    }

    private void acceptInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            String INP = scanner.nextLine();
            String[] parts = INP.split("\\s+");
            N = Integer.parseInt(parts[0]);
            M = Integer.parseInt(parts[1]);

            for (int i = 0; i < N; i++) {
                INP = scanner.nextLine();
                parts = INP.split("\\s+");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                int z = Integer.parseInt(parts[2]);

                c000[i] = -x - y - z;
                c001[i] = -x - y + z;
                c010[i] = -x + y - z;
                c100[i] = x - y - z;
                c011[i] = -x + y + z;
                c101[i] = x - y + z;
                c110[i] = x + y - z;
                c111[i] = x + y + z;
            }
        }
    }

    private void sortArrays() {
        Arrays.sort(c000);
        Arrays.sort(c001);
        Arrays.sort(c010);
        Arrays.sort(c100);
        Arrays.sort(c011);
        Arrays.sort(c101);
        Arrays.sort(c110);
        Arrays.sort(c111);
    }

    private void calculateSums() {
        for (int i = 0; i < M; i++) {
            cake000 += c000[i];
            cake001 += c001[i];
            cake010 += c010[i];
            cake100 += c100[i];
            cake011 += c011[i];
            cake101 += c101[i];
            cake110 += c110[i];
            cake111 += c111[i];
        }
    }

    private void findMax() {
        long max = Math.max(cake000, Math.max(cake001, Math.max(cake010, Math.max(cake100, Math.max(cake011, Math.max(cake101, Math.max(cake110, cake111)))))));
        ans = Long.toString(max);
    }

    private void displayResult() {
        System.out.println(ans);
    }
}