import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);

        if (a + b < c + d) {
            System.out.println("Right");
        } else if (a + b == c + d) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}