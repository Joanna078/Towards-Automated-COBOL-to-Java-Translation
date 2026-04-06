import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string:");
        String inp = scanner.nextLine();
        
        // Processing
        int n = inp.split(" ").length;
        String[] s = inp.split(" ");
        int h = 0;
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            if (!s[i].equals(s[j])) {
                h++;
            }
            i++;
            j--;
        }
        
        // Output
        System.out.println(h);
        
        scanner.close();
    }
}