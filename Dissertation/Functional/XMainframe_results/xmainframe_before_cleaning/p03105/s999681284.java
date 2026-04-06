import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atcoder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] numbers = input.split(" ");
        int a1 = Integer.parseInt(numbers[0]);
        int a2 = Integer.parseInt(numbers[1]);
        int a3 = Integer.parseInt(numbers[2]);
        int result = a2 / a1;
        if (result >= a3) {
            System.out.println(a3);
        } else {
            System.out.println(result);
        }
    }
}