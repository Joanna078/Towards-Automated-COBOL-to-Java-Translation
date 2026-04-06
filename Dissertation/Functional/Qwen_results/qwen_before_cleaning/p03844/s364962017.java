import java.util.Scanner;

public class ABC_050_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int a = Integer.parseInt(inp.split(" ")[0]);
        char op = inp.split(" ")[1].charAt(0);
        int b = Integer.parseInt(inp.split(" ")[2]);

        int ans;
        if (op == '+') {
            ans = a + b;
        } else {
            ans = a - b;
        }

        System.out.println(String.format("%d", ans));
    }
}
```

This Java code preserves the logic of the original COBOL program. It reads input from the user, processes it according to the specified operations, and then displays the result. The use of `Scanner` for input and `String.format` for output ensures that the behavior is consistent with the original COBOL program.