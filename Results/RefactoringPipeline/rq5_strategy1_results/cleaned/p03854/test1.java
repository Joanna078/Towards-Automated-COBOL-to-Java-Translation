import java.util.Scanner;

public class Test1 {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int now = 0;
    private char temp = '0';

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        inp = scanner.nextLine();
        scanner.close();
        processInput();
    }

    private void processInput() {
        if (!initialized) {
            initialized = true;
            now = 1;
        }

        for (int i = 0; i < inp.length(); i++) {
            char currentChar = inp.charAt(i);
            if (currentChar == ' ') {
                break;
            }
            now++;
        }

        if (now <= 4) {
            if (inp.substring(now - 1, now).equals("d")) {
                if (inp.substring(now - 5, now).equals("dream")) {
                    System.out.println("YES");
                    return;
                }
            } else if (inp.substring(now - 1, now).equals("e")) {
                if (inp.substring(now - 5, now).equals("erase")) {
                    System.out.println("YES");
                    return;
                }
            } else if (inp.substring(now - 1, now).equals("r")) {
                if (inp.substring(now - 6, now).equals("eraser")) {
                    System.out.println("YES");
                    return;
                }
            } else if (inp.substring(now - 1, now).equals("m")) {
                if (inp.substring(now - 7, now).equals("dreamer")) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}