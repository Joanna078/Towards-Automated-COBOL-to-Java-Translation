import java.util.Scanner;

public class ABC_107_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int i = Integer.parseInt(parts[1]);

        i = n - i + 1;
        String ans = String.valueOf(i);

        System.out.println(ans);
    }
}