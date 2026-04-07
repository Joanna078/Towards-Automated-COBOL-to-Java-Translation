import java.util.*;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        String indata2 = scanner.nextLine();

        int a1 = Integer.parseInt(indata.split(" ")[0]);

        if (a1 >= 3200) {
            System.out.println(indata2);
        } else {
            System.out.println("red");
        }
    }
}