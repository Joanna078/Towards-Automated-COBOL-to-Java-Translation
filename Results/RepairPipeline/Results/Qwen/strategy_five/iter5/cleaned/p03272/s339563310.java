import java.util.Scanner;

public class ABC_107_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input (format: N i): ");
        String inp = scanner.nextLine();
        
        // Data division
        int n = 0;
        int i = 0;
        String[] parts = inp.split("\\s+");
        if (parts.length == 2) {
            n = Integer.parseInt(parts[0]);
            i = Integer.parseInt(parts[1]);
        }
        
        // Processing section
        i = n - i;
        i++;
        
        // Output section
        String ans = String.format("%03d", i);
        unans(ans);
        
        System.out.println(ans); // Print the entire formatted string
    }

    private static void unans(String ans) {
        // This method does not need to modify 'ans' as it is already formatted correctly
    }
}