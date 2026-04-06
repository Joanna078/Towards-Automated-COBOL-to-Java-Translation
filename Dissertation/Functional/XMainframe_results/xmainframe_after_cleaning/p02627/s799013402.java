import java.util.Scanner;

public class Program_Id {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.compareTo("Z") <= 0) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
