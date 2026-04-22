import java.util.Scanner;

public class ABC_093_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of up to 4 characters: ");
        String inp = scanner.nextLine();
        scanner.close();

        int[] abc = new int[3];
        int maxlen = Math.min(inp.length(), 3);

        for (int i = 0; i < maxlen; i++) {
            char ch = inp.charAt(i);
            switch (ch) {
                case 'a':
                    abc[0] = 1;
                    break;
                case 'b':
                    abc[1] = 1;
                    break;
                default:
                    abc[2] = 1;
            }
        }

        if (abc[0] == 1 && abc[1] == 1 && abc[2] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}