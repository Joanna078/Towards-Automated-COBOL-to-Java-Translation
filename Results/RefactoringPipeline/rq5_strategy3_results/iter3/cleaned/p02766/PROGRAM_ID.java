import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        
        String[] parts = ln.split("\\s+");
        long n = Long.parseLong(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        int cnt = 1;
        while (n >= Math.pow(k, cnt)) {
            cnt++;
        }
        
        System.out.println(cnt);
        scanner.close();
    }
}