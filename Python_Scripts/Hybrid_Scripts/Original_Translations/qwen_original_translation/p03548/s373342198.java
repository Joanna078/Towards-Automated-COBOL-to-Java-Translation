import java.util.Scanner;

public class ABC_078_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int x = Integer.parseInt(inp.split(" ")[0]);
        int y = Integer.parseInt(inp.split(" ")[1]);
        int z = Integer.parseInt(inp.split(" ")[2]);

        int d = (x - z) / (y + z);

        StringBuilder ans = new StringBuilder();
        ans.append(d);

        System.out.println(ans.toString());
    }
}