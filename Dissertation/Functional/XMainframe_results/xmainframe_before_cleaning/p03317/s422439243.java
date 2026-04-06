import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        BigInteger num = new BigInteger(reader.readLine());
        System.out.println((num.subtract(BigInteger.valueOf(k))).divide(BigInteger.valueOf(k - 1)).add(BigInteger.ONE));
    }
}