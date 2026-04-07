import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        long ren = 0;
        int n = 0;

        // Find the first space and extract A
        int i = 0;
        while (i < inp.length() && inp.charAt(i) != ' ') {
            i++;
        }
        a = Integer.parseInt(inp.substring(0, i));

        // Find the second space and extract B
        i++;
        int j = i;
        while (j < inp.length() && inp.charAt(j) != ' ') {
            j++;
        }
        b = Integer.parseInt(inp.substring(i, j));

        // Extract C
        c = Integer.parseInt(inp.substring(j).trim());

        // Increment A
        a++;

        // Calculate REN
        for (n = 1; n <= a; n++) {
            int temp1 = 0;
            int temp2 = n;
            mod(temp1, temp2);
            if (temp1 >= b && temp1 <= c) {
                ren += n;
            }
        }

        System.out.println(ren);

        scanner.close();
    }

    private static void mod(int temp1, int temp2) {
        for (int k = 0; k < 5; k++) {
            int temp3 = temp2 / 10;
            temp1 += temp2 - temp3 * 10;
            temp2 = temp3;
        }
    }
}