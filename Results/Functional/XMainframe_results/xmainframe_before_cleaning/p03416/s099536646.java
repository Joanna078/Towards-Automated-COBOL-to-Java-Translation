import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPalindrome(int num) {
        return num / 10000 == num % 10
                && (num / 1000) % 10 == (num / 10) % 10;
    }
}