import java.util.Scanner;

public class ABC_059_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();

        String[] parts = inp.split("\\s+");
        String s1 = parts[0].toUpperCase();
        String s2 = parts.length > 1 ? parts[1].toUpperCase() : "";
        String s3 = parts.length > 2 ? parts[2].toUpperCase() : "";

        System.out.println(s1.charAt(0) + "" + s2.charAt(0) + "" + s3.charAt(0));
    }
}