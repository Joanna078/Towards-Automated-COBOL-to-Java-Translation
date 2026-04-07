import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String a = arr[0];
        String b = arr[1];
        s = a.trim() + b.trim();
        int v;
        try {
            v = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("No");
            return;
        }
        boolean isSquareNumber = false;
        for (int i = 1; i < 1000; i++) {
            long square = (long) i * i;
            if (square == v) {
                isSquareNumber = true;
                break;
            }
        }
        System.out.println(isSquareNumber ? "Yes" : "No");
    }
}