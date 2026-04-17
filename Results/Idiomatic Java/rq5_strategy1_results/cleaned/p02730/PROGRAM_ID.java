import java.util.Arrays;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private byte[] S = new byte[100];
    private byte[] X = new byte[100];
    private byte[] cur = new byte[100];
    private byte[] pre = new byte[100];
    private byte[] n = new byte[10];
    private byte[] m = new byte[10];
    private byte[] i = new byte[10];

    private static final byte[] str_0_0000000001 = "0000000001".getBytes();
    private static final byte[] str_1_Yes = "Yes".getBytes();
    private static final byte[] str_2_No = "No".getBytes();

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        acceptInput();
        computeAndReverse();
        checkEqualityAndDisplay();
    }

    private void initialize() {
        Arrays.fill(S, (byte) ' ');
        Arrays.fill(X, (byte) ' ');
        Arrays.fill(cur, (byte) ' ');
        Arrays.fill(pre, (byte) ' ');
        Arrays.fill(n, (byte) '0');
        Arrays.fill(m, (byte) '0');
        Arrays.fill(i, (byte) '0');
        initialized = true;
    }

    private void acceptInput() {
        // Simulate ACCEPT statement
        System.arraycopy("Sample Input".getBytes(), 0, S, 0, "Sample Input".length());
    }

    private void computeAndReverse() {
        int length = getStoredCharLength(S);
        System.arraycopy(Integer.toString(length).getBytes(), 0, n, 0, Integer.toString(length).length());
        System.arraycopy(n, 0, m, 0, 10);

        reverseString(S, cur);
    }

    private void checkEqualityAndDisplay() {
        if (Arrays.equals(cur, S)) {
            Arrays.fill(cur, (byte) ' ');
            int halfLength = Integer.parseInt(new String(m)) / 2;
            System.arraycopy(Integer.toString(halfLength).getBytes(), 0, m, 0, Integer.toString(halfLength).length());
            reverseString(S, cur);

            if (Arrays.equals(cur, X)) {
                display(str_1_Yes);
            } else {
                display(str_2_No);
            }
        } else {
            display(str_2_No);
        }
    }

    private void reverseString(byte[] input, byte[] output) {
        for (int j = 0; j < input.length; j++) {
            output[j] = input[input.length - 1 - j];
        }
    }

    private int getStoredCharLength(byte[] array) {
        int length = 0;
        for (byte b : array) {
            if (b != 0 && b != ' ') {
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    private void display(byte[] message) {
        System.out.println(new String(message));
    }
}