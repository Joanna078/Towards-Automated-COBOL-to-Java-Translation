import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter S: ");
        String s = scanner.nextLine();

        // Processing section
        long cnt = s.chars()
                    .filter(c -> c == 'A' || c == 'B' || c == 'C')
                    .count();
        
        // Output section
        System.out.println(cnt);
    }
}