import java.util.Arrays;

public class ABC_088_B {

    private static final int MAX_N = 100;
    private static final int INPUT_LENGTH = 600;

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String INP = scanner.nextLine();

        int[] qary = new int[MAX_N];
        int maxlen = Math.min(N, INPUT_LENGTH);
        int cur = 0;
        int len;

        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < INPUT_LENGTH && INP.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            qary[i] = Integer.parseInt(INP.substring(cur, cur + len));
            cur = j + 1;
        }

        int qlast = N;
        int qfirst = 1;
        int flg = 1;

        while (flg != 0) {
            if (qfirst < qlast) {
                quickSort(qary, qfirst, qlast);
                if (qfirst < q - 1) {
                    q--;
                    qlast = q;
                    quickSort(qary, qfirst, qlast);
                } else if (q + 1 < qlast) {
                    q++;
                    qfirst = q;
                    quickSort(qary, qfirst, qlast);
                } else {
                    flg = 0;
                }
            } else {
                flg = 0;
            }
        }

        int alice = 0;
        int bob = 0;
        int num = 0;

        for (int i = N - 1; i >= 0; i--) {
            num++;
            if (num % 2 == 0) {
                bob += qary[i];
            } else {
                alice += qary[i];
            }
        }

        int result = alice - bob;
        System.out.printf("%+05d%n", result);
    }

    private static int q;

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            q = pivotIndex;
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}