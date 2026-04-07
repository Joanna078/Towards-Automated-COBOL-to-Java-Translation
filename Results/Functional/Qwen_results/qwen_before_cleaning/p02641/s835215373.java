import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inp = "your_input_here"; // Replace with actual input
        int x = Integer.parseInt(inp.split(" ")[0]);
        int n = Integer.parseInt(inp.split(" ")[1]);

        int[] tbl1 = new int[103];
        Arrays.fill(tbl1, 0);

        int p1 = 1;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            int idx = Integer.parseInt(inp.substring(p1 - 1, p2));
            tbl1[idx] = 1;
            p1 = p2 + 1;
        }

        int cnt;
        if (n == 0 || tbl1[x + 1] == 0) {
            cnt = x;
        } else {
            int idx = 1;
            while (idx <= n && tbl1[x - idx + 1] == 0 && tbl1[x + idx + 1] == 0) {
                idx++;
            }
            if (tbl1[x - idx + 1] == 0) {
                cnt = x - idx;
            } else {
                cnt = x + idx;
            }
        }

        System.out.println(cnt);
    }
}
```

### Explanation of Complex Logic:
1. **Input Parsing**: The input string is split into `x` and `n` using `split(" ")`.
2. **Table Initialization**: An array `tbl1` of size 103 is initialized to zero to store counts.
3. **Counting Occurrences**:
   - A nested loop iterates through the input string to count occurrences of each number and store them in `tbl1`.
4. **Finding Count**:
   - If `n` is zero or `tbl1[x + 1]` is zero, `cnt` is set to `x`.
   - Otherwise, it finds the maximum distance from `x` where both left and right counts are non-zero.
5. **Output**: The result is printed to the console.