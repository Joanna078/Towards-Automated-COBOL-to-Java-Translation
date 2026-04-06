import java.util.Scanner;

public class ABC_102_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        // Initialize variables
        int maxlen = n;
        int cur = 1;
        int i = 1;
        long minVal = Long.MAX_VALUE;
        long maxVal = 0;
        StringBuilder ans = new StringBuilder();
        long zs;

        while (i <= maxlen) {
            int j = cur;
            while (j <= maxlen && j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }

            int len = j - cur;
            if (len > 0) {
                String a = inp.substring(cur - 1, j - 1);

                long aLong = Long.parseLong(a);
                minVal = Math.min(minVal, aLong);
                maxVal = Math.max(maxVal, aLong);
            }

            cur = j + 1;
            i++;
        }

        zs = maxVal - minVal;

        // Convert zs to a string and format it to have 10 digits
        String zsStr = String.format("%10d", zs).replace(' ', '0');

        // Reverse the string representation of zs
        for (int k = zsStr.length() - 1; k >= 0; k--) {
            ans.append(zsStr.charAt(k));
        }

        // Display the result
        System.out.println(ans.toString().trim());

        scanner.close();
    }
}