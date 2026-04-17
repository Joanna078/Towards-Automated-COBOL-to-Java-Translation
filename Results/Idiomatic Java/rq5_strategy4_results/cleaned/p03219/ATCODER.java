import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        
        String[] parts = indata.split("\\s+");
        long a1 = Long.parseLong(parts[0]);
        long a2 = Long.parseLong(parts[1]);
        
        long r = a1 + (a2 / 2);
        String disp = String.format("%20d", r).trim();
        
        System.out.println(disp);
    }
}