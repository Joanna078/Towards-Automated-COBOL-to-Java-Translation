import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        String[] parts = ln.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);

        String inData = scanner.nextLine();
        scanner.close();

        int[] p = new int[n];
        int cur = 0;
        int i = 0;

        while (cur < inData.length()) {
            int j = cur;
            while (j < inData.length() && inData.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            p[i++] = Integer.parseInt(inData.substring(cur, j));
            cur = j + 1;
        }

        Arrays.sort(p);

        int ans = 0;
        for (int m = 0; m < k; m++) {
            ans += p[m];
        }

        System.out.println(ans);
    }
}
```

### Explanation of Complex Logic:
1. **Input Handling**: The COBOL program reads input from `SYSIN` which is replaced with `Scanner` in Java.
2. **String Splitting**: The COBOL program uses `UNSTRING` to split the input string into `N` and `K`. In Java, this is done using `split`.
3. **Reading Input Data**: The COBOL program reads another line of input into `INDATA`. This is also handled using `Scanner`.
4. **Parsing and Storing Data**: The COBOL program extracts numbers from `INDATA` and stores them in an array `p`. This is achieved using a loop that iterates through the string and parses integers.
5. **Sorting**: The COBOL program sorts the array `p` in ascending order. This is done using `Arrays.sort` in Java.
6. **Summing Values**: The COBOL program sums the first `K` elements of the sorted array. This is implemented using a simple loop in Java.
7. **Output**: The COBOL program displays the result using `DISPLAY`. In Java, this is done using `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.