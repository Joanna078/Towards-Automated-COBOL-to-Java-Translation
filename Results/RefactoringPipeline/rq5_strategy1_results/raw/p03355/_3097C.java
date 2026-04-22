```java
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String s = "";
    private int k = 0;
    private int i = 0;
    private int j = 0;
    private int jw = 0;
    private char[] tbl = new char[125000];
    private int sN = 0;
    private int ix = 0;
    private int len = 0;
    private String out = "";

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT S
        System.out.print("Enter S: ");
        s = scanner.nextLine();

        // ACCEPT K
        System.out.print("Enter K: ");
        k = scanner.nextInt();

        // UNSTRING S DELIMITED BY ' ' INTO LEN
        String[] parts = s.split(" ");
        len = parts.length;

        if (len < 5) {
            sN = (len * (len + 1)) / 2;
        } else {
            sN = (len - 4) * 5 + 10;
        }

        ix = 0;
        for (i = 1; i <= len; i++) {
            for (j = 1; j <= 5 && i + j <= len; j++) {
                ix++;
                System.arraycopy(parts[i - 1].getBytes(), 0, tbl, (ix - 1) * 5, Math.min(5, parts[i - 1].length()));
            }
        }

        // SORT TBL
        sort(tbl, 0, ix * 5 - 1);

        for (i = 1; i <= k; i++) {
            jw = j;
            while (j < ix && new String(tbl, (j - 1) * 5, 5).equals(new String(tbl, (jw - 1) * 5, 5))) {
                j++;
            }
            i++;
        }

        out = new String(tbl, (j - 1) * 5, 5);
        System.out.println(out);

        returnCode = 0;
    }

    private void sort(char[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            sort(array, left, pivotIndex - 1);
            sort(array, pivotIndex + 1, right);
        }
    }

    private int partition(char[] array, int left, int right) {
        char pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
```