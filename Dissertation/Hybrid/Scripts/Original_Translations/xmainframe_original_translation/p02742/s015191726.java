import java.util.*;
public class Bishop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] dimensions = input.split(" ");
        int height = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);
        if (height == 1 || width == 1) {
            System.out.println(0);
        } else {
            int side1 = height / 2;
            int side2 = width / 2;
            if (height == side1 * 2 || width == side2 * 2) {
                System.out.println(height * width / 2);
            } else {
                System.out.println(height * width / 2 + 1);
            }
        }
    }
}
