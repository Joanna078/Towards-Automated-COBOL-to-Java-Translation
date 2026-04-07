import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = input.length() - 1;

        while (index >= 0) {
            if (input.charAt(index) == ' ') {
                break;
            }
            index--;
        }

        boolean valid = true;
        int count = 0;

        while (index >= 0) {
            char c = input.charAt(index);

            if (c == 'm') {
                if (count < 4) {
                    valid = false;
                    break;
                }
                count -= 4;
                if (!input.substring(index - 4, index + 1).equals("dream")) {
                    valid = false;
                    break;
                }
                index -= 5;
            } else if (c == 'e') {
                if (count < 4) {
                    valid = false;
                    break;
                }
                count -= 4;
                if (!input.substring(index - 4, index + 1).equals("erase")) {
                    valid = false;
                    break;
                }
                index -= 5;
            } else if (c == 'r') {
                if (count < 1) {
                    valid = false;
                    break;
                }
                count -= 1;
                if (input.charAt(index - 1) == 'e') {
                    if (count < 1) {
                        valid = false;
                        break;
                    }
                    count -= 1;
                    if (input.charAt(index - 2) == 'm') {
                        if (count < 4) {
                            valid = false;
                            break;
                        }
                        count -= 4;
                        if (!input.substring(index - 7, index + 1).equals("dreamer")) {
                            valid = false;
                            break;
                        }
                        index -= 8;
                    } else if (input.charAt(index - 2) == 's') {
                        if (count < 3) {
                            valid = false;
                            break;
                        }
                        count -= 3;
                        if (!input.substring(index - 6, index + 1).equals("eraser")) {
                            valid = false;
                            break;
                        }
                        index -= 7;
                    } else {
                        valid = false;
                        break;
                    }
                } else {
                    valid = false;
                    break;
                }
            } else {
                valid = false;
                break;
            }
        }

        System.out.println(valid ? "YES" : "NO");
    }
}
