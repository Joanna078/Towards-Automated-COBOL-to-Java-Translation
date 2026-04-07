import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String s = sc.nextLine();
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        boolean flg = true;
        for (int i = 1; a + b + 1 > i; i++) {
            if (a + 1 == i && !s.substring(i - 1, i).equals("-")) {
                flg = false;
                break;
            } else if (a + 1 != i && s.substring(i - 1, i).equals("-")) {
                flg = false;
                break;
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }
}