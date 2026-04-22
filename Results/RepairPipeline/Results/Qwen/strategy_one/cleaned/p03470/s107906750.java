import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        // Working storage section
        char[] inp = new char[11000];
        int[] aData = new int[100];
        Arrays.fill(aData, 0);
        int b = 0;
        int c = 0;
        int d = 0;
        int alice = 0;
        int bob = 0;
        long ren = 0L;
        String re = "";
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int now = 0;
        int n = 0;
        int max = 0;

        // Main procedure
        for (n = 0; n < 100; n++) {
            aData[n] = 0;
        }

        System.out.print("Enter value for B: ");
        b = Integer.parseInt(System.console().readLine());
        b++;

        for (n = 0; n < b; n++) {
            System.out.print("Enter value for C: ");
            c = Integer.parseInt(System.console().readLine());
            aData[c - 1]++;
        }

        d = 0;
        for (n = 0; n < 100; n++) {
            if (aData[n] > 0) {
                d++;
            }
        }

        re = String.format("%010d", d);
        System.out.println(re);
    }
}