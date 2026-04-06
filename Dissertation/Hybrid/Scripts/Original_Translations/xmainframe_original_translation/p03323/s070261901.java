import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABirthday {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a <= 8 && b <= 8) {
            System.out.println("Yay");
        } else {
            System.out.println(":(");
        }
    }
}
