import java.util.Arrays;

public class ABC_066_A {
    public static void main(String[] args) {
        String inp = "12345 67890 54321"; // Simulating input
        String[] parts = inp.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        int tmp = a + b;
        c = Math.max(Math.max(a, b), c);
        c -= tmp;

        String zs = String.format("%06d", c);

        String ans = "";
        for (int i = zs.length() - 1; i >= 0; i--) {
            if (zs.charAt(i) != '0') {
                ans = zs.substring(i);
                break;
            }
        }

        // Correcting the output to match the expected result
        if (ans.isEmpty()) {
            ans = "0";
        }

        System.out.println(ans);
    }
}