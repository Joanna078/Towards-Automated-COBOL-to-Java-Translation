import java.util.Arrays;
import java.util.Scanner;

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
        for (n = 1; n <= 100; n++) {
            aData[n - 1] = 0;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for B: ");
        b = Integer.parseInt(scanner.nextLine());
        b++;

        for (n = 1; n < b; n++) {
            System.out.print("Enter value for C: ");
            c = Integer.parseInt(scanner.nextLine());
            aData[c - 1]++;
        }

        d = 0;
        for (n = 1; n <= 100; n++) {
            if (aData[n - 1] > 0) {
                d++;
            }
        }

        re = String.format("%010d", d);
        System.out.println(re);

        scanner.close();
    }
}