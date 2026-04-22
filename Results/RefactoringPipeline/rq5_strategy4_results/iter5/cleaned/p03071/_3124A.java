import java.util.Scanner;

public class Program124A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int OUT;

        if (A == B) {
            OUT = A * 2;
        } else if (A > B) {
            OUT = A * 2 - 1;
        } else {
            OUT = B * 2 - 1;
        }

        System.out.println(OUT);
    }
}