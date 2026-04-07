import java.util.*;

public class Atcoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        String[] numbers = indata.split(" ");
        int a1 = Integer.parseInt(numbers[0]);
        int a2 = Integer.parseInt(numbers[1]);
        double r = a1 + (a2 / 2.0);
        System.out.println(Math.round(r));
    }
}