import java.util.Arrays;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private int n;
    private int i;
    private String[] tbl = new String[200000];
    private int cnt = 0;
    private int out;

    public static void main(String[] args) {
        new Main().execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        acceptN();
        processInput();
        sortTable();
        countUniqueEntries();
        displayResult();
    }

    private void initialize() {
        Arrays.fill(tbl, "");
        initialized = true;
    }

    private void acceptN() {
        // Simulate accepting input for N
        n = 5; // Example value
    }

    private void processInput() {
        for (i = 1; i <= n; i++) {
            acceptS();
        }
    }

    private void acceptS() {
        // Simulate accepting input for S
        tbl[i - 1] = "example" + i; // Example value
    }

    private void sortTable() {
        Arrays.sort(tbl, 0, n);
    }

    private void countUniqueEntries() {
        cnt = 1;
        for (i = 1; i < n; i++) {
            if (!tbl[i].equals(tbl[i - 1])) {
                cnt++;
            }
        }
    }

    private void displayResult() {
        out = cnt;
        System.out.println(out);
    }
}