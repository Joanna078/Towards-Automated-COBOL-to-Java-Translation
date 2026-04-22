import java.util.Scanner;

public class ABC_088_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        scanner.close();
        int maxlen = n;
        int[] qary = new int[100];
        int cur = 1;
        int len;
        int qlast = n;
        int flg = 1;
        int alice = 0;
        int bob = 0;
        int d, r;
        int zs;
        char[] ans = new char[5];

        while (cur <= maxlen) {
            int j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) { // Ensure substring is not empty
                qary[cur - 1] = Integer.parseInt(inp.substring(cur - 1, j - 1));
            }
            cur = j;
        }

        while (flg == 1) {
            if (1 < qlast) {
                qsort(qary, 0, qlast - 1);
                if (1 < qlast - 1) {
                    qlast--;
                    qsort(qary, 0, qlast - 1);
                } else if (1 + 1 < qlast) {
                    qlast--;
                    qsort(qary, 0, qlast - 1);
                } else {
                    flg = 0;
                }
            } else {
                flg = 0;
            }
        }

        for (int i = n; i > 0; i--) {
            int num = i;
            d = num / 2;
            r = num % 2;
            if (r == 0) {
                bob += qary[i - 1];
            } else {
                alice += qary[i - 1];
            }
        }

        alice -= bob;
        zs = alice;

        unans(zs, ans);

        System.out.println(new String(ans).trim());
    }

    private static void qsort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            qsort(arr, low, pi - 1);
            qsort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    private static void unans(int zs, char[] ans) {
        String str = String.format("%05d", zs);
        for (int i = 0; i < str.length(); i++) {
            ans[i] = str.charAt(i);
        }
    }
}