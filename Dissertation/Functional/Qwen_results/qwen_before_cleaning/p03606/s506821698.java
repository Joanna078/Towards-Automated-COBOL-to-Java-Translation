import java.util.Scanner;

public class ABC_073_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String inp = scanner.nextLine();
            String[] parts = inp.split(" ");
            int l = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);

            r = r - l + 1;
            sum += r;
        }

        String zs = String.format("%07d", sum);
        String ans = "";

        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans += c;
            }
        }

        System.out.println(ans.substring(0, ans.length()));
    }
}
```

This Java code preserves the logic and behavior of the original COBOL program. It reads an integer `n`, then processes `n` lines of input where each line contains two integers `l` and `r`. For each pair, it calculates `r - l + 1` and adds it to a sum. The final sum is formatted as a 7-digit string, removing any leading spaces, and then printed.