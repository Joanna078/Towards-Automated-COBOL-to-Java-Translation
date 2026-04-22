import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abcd = new int[4];
        for (int i = 0; i < 4; i++) {
            abcd[i] = sc.nextInt();
        }
        Arrays.sort(abcd);
        if (abcd[0] - abcd[2] <= abcd[3]) {
            System.out.println("Yes");
        } else if (abcd[1] - abcd[2] <= abcd[3] && abcd[2] - abcd[3] <= abcd[0]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
