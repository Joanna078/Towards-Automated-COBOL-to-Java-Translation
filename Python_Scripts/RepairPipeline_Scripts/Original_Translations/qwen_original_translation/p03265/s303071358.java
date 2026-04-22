import java.util.Scanner;

public class ABC_108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int x1 = Integer.parseInt(inp.split(" ")[0]);
        int y1 = Integer.parseInt(inp.split(" ")[1]);
        int x2 = Integer.parseInt(inp.split(" ")[2]);
        int y2 = Integer.parseInt(inp.split(" ")[3]);

        int dx = x2 - x1;
        int dy = y2 - y1;

        int ddx = Math.abs(dx);
        int ddy = Math.abs(dy);

        int a1, a2, a3, a4;
        if (dx >= 0 && dy >= 0) {
            a1 = x2 - ddy;
            a2 = y2 + ddx;
            a3 = a1 - ddx;
            a4 = a2 - ddy;
        } else if (dx < 0 && dy >= 0) {
            a1 = x2 - ddy;
            a2 = y2 - ddx;
            a3 = a1 + ddx;
            a4 = a2 - ddy;
        } else if (dx < 0 && dy < 0) {
            a1 = x2 + ddy;
            a2 = y2 - ddx;
            a3 = a1 + ddx;
            a4 = a2 + ddy;
        } else {
            a1 = x2 + ddy;
            a2 = y2 + ddx;
            a3 = a1 - ddx;
            a4 = a2 + ddy;
        }

        System.out.println(unans(a1) + " " + unans(a2) + " " + unans(a3) + " " + unans(a4));
    }

    private static String unans(int value) {
        return String.format("%d", value).strip();
    }
}