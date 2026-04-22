import java.util.Scanner;

public class ABC_100_D {

    private boolean initialized = false;
    private int returnCode = 0;
    private int N, M;
    private String INP, x, y, z, ans;
    private int[] c000 = new int[1000];
    private int[] c001 = new int[1000];
    private int[] c010 = new int[1000];
    private int[] c100 = new int[1000];
    private int[] c011 = new int[1000];
    private int[] c101 = new int[1000];
    private int[] c110 = new int[1000];
    private int[] c111 = new int[1000];
    private int cake000, cake001, cake010, cake100, cake011, cake101, cake110, cake111;

    public static void main(String[] args) {
        new ABC_100_D().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        INP = scanner.nextLine();

        String[] parts = INP.split("\\s+");
        N = Integer.parseInt(parts[0]);
        M = Integer.parseInt(parts[1]);

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter values for iteration " + i + ":");
            String[] values = scanner.nextLine().split("\\s+");
            x = values[0];
            y = values[1];
            z = values[2];

            int sm = Integer.parseInt(x) - Integer.parseInt(y) - Integer.parseInt(z);
            c000[i - 1] = sm;

            sm = Integer.parseInt(x) - Integer.parseInt(y) + Integer.parseInt(z);
            c001[i - 1] = sm;

            sm = Integer.parseInt(x) + Integer.parseInt(y) - Integer.parseInt(z);
            c010[i - 1] = sm;

            sm = Integer.parseInt(x) + Integer.parseInt(y) + Integer.parseInt(z);
            c100[i - 1] = sm;
        }

        for (int i = 1; i <= M; i++) {
            cake000 += c000[i - 1];
            cake001 += c001[i - 1];
            cake010 += c010[i - 1];
            cake100 += c100[i - 1];
            cake011 += c011[i - 1];
            cake101 += c101[i - 1];
            cake110 += c110[i - 1];
            cake111 += c111[i - 1];
        }

        int max = Math.max(cake000, Math.max(cake001, Math.max(cake010, Math.max(cake100, Math.max(cake011, Math.max(cake101, Math.max(cake110, cake111)))))));
        ans = String.valueOf(max);

        System.out.println("Result: " + ans);
    }
}