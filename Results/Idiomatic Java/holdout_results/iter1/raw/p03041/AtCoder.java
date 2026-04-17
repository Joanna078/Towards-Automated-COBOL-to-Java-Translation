```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first input
        String inp = scanner.nextLine();
        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        String A = inp.substring(0, temp1);

        // Read second input
        int temp2 = temp1 + 2;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        int N = temp2 - temp1;
        String B = inp.substring(temp1, temp1 + N);

        // Read third input
        inp = scanner.nextLine();
        char charAtB = inp.charAt(Integer.parseInt(B) - 1);
        switch (charAtB) {
            case 'A':
                inp = inp.substring(0, Integer.parseInt(B) - 1) + 'a' + inp.substring(Integer.parseInt(B));
                break;
            case 'B':
                inp = inp.substring(0, Integer.parseInt(B) - 1) + 'b' + inp.substring(Integer.parseInt(B));
                break;
            case 'C':
                inp = inp.substring(0, Integer.parseInt(B) - 1) + 'c' + inp.substring(Integer.parseInt(B));
                break;
        }

        // Output the modified string
        System.out.println(inp);
    }
}
```