import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);

        double lef = a + b;
        double rig = c;

        if (lef < rig) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}