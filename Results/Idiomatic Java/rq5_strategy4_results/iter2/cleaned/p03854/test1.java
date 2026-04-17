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
                if (index <= 3) {
                    System.out.println("NO");
                    return;
                }
                index -= 4;
                if (!"dream".equals(inp.substring(index, index + 5))) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentChar == 'e') {
                if (index <= 3) {
                    System.out.println("NO");
                    return;
                }
                index -= 4;
                if (!"erase".equals(inp.substring(index, index + 5))) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentChar == 'r') {
                if (index <= 0) {
                    System.out.println("NO");
                    return;
                }
                index--;
                if (inp.charAt(index) == 'e') {
                    if (index <= 0) {
                        System.out.println("NO");
                        return;
                    }
                    index--;
                    if (inp.charAt(index) == 'm') {
                        if (index <= 3) {
                            System.out.println("NO");
                            return;
                        }
                        index -= 4;
                        if (!"dreamer".equals(inp.substring(index, index + 7))) {
                            System.out.println("NO");
                            return;
                        }
                    } else if (inp.charAt(index) == 's') {
                        if (index <= 2) {
                            System.out.println("NO");
                            return;
                        }
                        index -= 3;
                        if (!"eraser".equals(inp.substring(index, index + 6))) {
                            System.out.println("NO");
                            return;
                        }
                    } else {
                        System.out.println("NO");
                        return;
                    }
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