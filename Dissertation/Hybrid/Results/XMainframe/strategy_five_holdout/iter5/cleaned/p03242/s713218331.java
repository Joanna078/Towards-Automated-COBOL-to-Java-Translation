import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String converted = Integer.toString(n).replace("19", "91");
        System.out.println(Integer.parseInt(converted));
    }
}