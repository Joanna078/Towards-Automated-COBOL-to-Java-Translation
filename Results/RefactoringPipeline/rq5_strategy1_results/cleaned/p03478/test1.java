import java.math.BigDecimal;
import java.util.Scanner;

public class Test1 {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);

    private int b_RETURN_CODE = 0;
    private char[] b_INP = new char[100];
    private char[] b_A = new char[8];
    private char[] b_B = new char[8];
    private char[] b_C = new char[10];
    private char[] b_REN = new char[10];
    private char[] b_RE = new char[11];
    private char[] b_temp1 = new char[7];
    private char[] b_temp2 = new char[7];
    private char[] b_temp3 = new char[7];
    private char[] b_N = new char[7];

    public static void main(String[] args) {
        new Test1().execute();
    }

    public void execute() {
        runModule(0);
    }

    private void runModule(int entry) {
        if (entry < 0) {
            if (!initialized) {
                initialized = true;
                return;
            }
            clearArrays();
            initialized = false;
            return;
        }

        if (!initialized) {
            initialized = true;
            initializeArrays();
        }

        mainSection();
    }

    private void clearArrays() {
        d0 = BigDecimal.ZERO;
        d1 = BigDecimal.ZERO;
        d2 = BigDecimal.ZERO;
        b_RETURN_CODE = 0;
    }

    private void initializeArrays() {
        for (int i = 0; i < b_INP.length; i++) b_INP[i] = ' ';
        for (int i = 0; i < b_A.length; i++) b_A[i] = '0';
        for (int i = 0; i < b_B.length; i++) b_B[i] = '0';
        for (int i = 0; i < b_C.length; i++) b_C[i] = '0';
        for (int i = 0; i < b_REN.length; i++) b_REN[i] = '0';
        for (int i = 0; i < b_RE.length; i++) b_RE[i] = '0';
        for (int i = 0; i < b_temp1.length; i++) b_temp1[i] = '0';
        for (int i = 0; i < b_temp2.length; i++) b_temp2[i] = '0';
        for (int i = 0; i < b_temp3.length; i++) b_temp3[i] = '0';
        for (int i = 0; i < b_N.length; i++) b_N[i] = '0';
    }

    private void mainSection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length() && i < b_INP.length; i++) {
            b_INP[i] = input.charAt(i);
        }

        int temp1Index = 0;
        while (temp1Index < b_INP.length && b_INP[temp1Index] != ' ') {
            temp1Index++;
        }
        d0 = new BigDecimal(new String(b_INP, 0, temp1Index));

        int temp2Index = temp1Index + 1;
        while (temp2Index < b_INP.length && b_INP[temp2Index] != ' ') {
            temp2Index++;
        }
        d1 = new BigDecimal(new String(b_INP, temp1Index + 1, temp2Index - temp1Index - 1));

        d0 = d0.subtract(d1);
        for (int i = 0; i < d0.toString().length() && i < b_A.length; i++) {
            b_A[i] = d0.toString().charAt(i);
        }

        d1 = d1.add(BigDecimal.ONE);
        temp2Index += 1;
        while (temp2Index < b_INP.length && b_INP[temp2Index] != ' ') {
            temp2Index++;
        }
        d2 = new BigDecimal(new String(b_INP, temp1Index + 1, temp2Index - temp1Index - 1));

        d0 = d2.subtract(d1);
        for (int i = 0; i < d0.toString().length() && i < b_B.length; i++) {
            b_B[i] = d0.toString().charAt(i);
        }

        d1 = d1.add(BigDecimal.ONE);
        temp1Index = temp2Index + 1;
        while (temp1Index < b_INP.length && b_INP[temp1Index] != ' ') {
            temp1Index++;
        }
        d2 = new BigDecimal(new String(b_INP, temp2Index + 1, temp1Index - temp2Index - 1));

        d0 = d2.subtract(d1);
        for (int i = 0; i < d0.toString().length() && i < b_C.length; i++) {
            b_C[i] = d0.toString().charAt(i);
        }

        d1 = d1.add(BigDecimal.ONE);
        for (int i = 0; i < b_REN.length; i++) {
            b_REN[i] = '0';
        }

        BigDecimal n = BigDecimal.ZERO;
        while (n.compareTo(new BigDecimal(b_A)) < 0) {
            for (int i = 0; i < b_temp1.length; i++) {
                b_temp1[i] = '0';
            }
            for (int i = 0; i < b_temp2.length; i++) {
                b_temp2[i] = b_N[i];
            }
            modSection();
            if (new String(b_temp1).compareTo(new String(b_B)) >= 0 && n.compareTo(new BigDecimal(b_C)) <= 0) {
                n = n.add(BigDecimal.ONE);
            }
        }

        for (int i = 0; i < n.toString().length() && i < b_RE.length; i++) {
            b_RE[i] = n.toString().charAt(i);
        }

        System.out.println("Result: " + new String(b_RE).trim());
        System.exit(b_RETURN_CODE);
    }

    private void modSection() {
        for (int i = 0; i < 5; i++) {
            d0 = d2.divide(BigDecimal.TEN);
            for (int j = 0; j < d0.toString().length() && j < b_temp3.length; j++) {
                b_temp3[j] = d0.toString().charAt(j);
            }
            d0 = d1.add(d2);
            d1 = d0.subtract(d2.multiply(BigDecimal.TEN));
            for (int j = 0; j < d1.toString().length() && j < b_temp1.length; j++) {
                b_temp1[j] = d1.toString().charAt(j);
            }
            for (int j = 0; j < b_temp3.length; j++) {
                b_temp2[j] = b_temp3[j];
            }
        }
    }
}