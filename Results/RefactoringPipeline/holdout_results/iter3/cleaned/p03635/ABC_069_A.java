import java.util.Scanner;

public class ABC_069_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\s+");
        int n = Integer.parseInt(parts[0]) - 1;
        int m = Integer.parseInt(parts[1]) - 1;
        
        int tmp = n * m;
        String ans = String.valueOf(tmp);
        
        System.out.println(ans);
    }
}