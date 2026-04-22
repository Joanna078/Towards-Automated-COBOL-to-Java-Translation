import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().stripTrailing();
        scanner.close();

        int index = inp.length() - 1;

        while (index >= 0) {
            char currentChar = inp.charAt(index);

            if (currentChar == 'm') {
                if (index <= 3 || !"dream".equals(inp.substring(index - 4, index + 1))) {
                    System.out.println("NO");
                    return;
                }
                index -= 4;
            } else if (currentChar == 'e') {
                if (index <= 3 || !"erase".equals(inp.substring(index - 4, index + 1))) {
                    System.out.println("NO");
                    return;
                }
                index -= 4;
            } else if (currentChar == 'r') {
                if (index <= 0 || inp.charAt(index - 1) != 'e') {
                    System.out.println("NO");
                    return;
                }
                index--;
                if (inp.charAt(index) == 'm') {
                    if (index <= 3 || !"dreamer".equals(inp.substring(index - 4, index + 1))) {
                        System.out.println("NO");
                        return;
                    }
                    index -= 4;
                } else if (inp.charAt(index) == 's') {
                    if (index <= 2 || !"eraser".equals(inp.substring(index - 3, index + 1))) {
                        System.out.println("NO");
                        return;
                    }
                    index -= 3;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                System.out.println("NO");
                return;
            }
            index--;
        }

        System.out.println("YES");
    }
}