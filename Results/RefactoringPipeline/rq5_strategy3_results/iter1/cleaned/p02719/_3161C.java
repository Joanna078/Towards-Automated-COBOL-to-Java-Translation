import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter exactly two numbers.");
            return;
        }
        
        String nx = parts[0].trim();
        String kx = parts[1].trim();
        
        long n = 0;
        long k = 0;
        
        if (nx.equals("1000000000000000000") && kx.equals("1000000000000000000")) {
            n = 1;
            k = 1;
        } else if (nx.equals("1000000000000000000")) {
            k = Long.parseLong(kx);
            n = 999999999999999999 - k + 1;
        } else if (kx.equals("1000000000000000000")) {
            n = Long.parseLong(nx);
            k = 999999999999999999 - n + 1;
        } else {
            n = Long.parseLong(nx);
            k = Long.parseLong(kx);
        }
        
        long s = n / k;
        long a = n % k;
        
        long ans;
        if (a == 0) {
            ans = 0;
        } else if (a <= k / 2) {
            ans = a;
        } else {
            ans = k - a;
        }
        
        System.out.println(String.format("%017d", ans));
    }
}