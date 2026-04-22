import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        String[] parts = inp.split(" ");
        String s = "x".repeat(parts.length);
        
        System.out.println(s);
    }
}