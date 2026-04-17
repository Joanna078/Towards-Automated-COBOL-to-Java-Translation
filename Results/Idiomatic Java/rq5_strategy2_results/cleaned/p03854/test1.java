import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int now = inp.length() - 1;

        while (now >= 0 && !inp.substring(now, now + 1).equals(" ")) {
            char currentChar = inp.charAt(now);

            if (currentChar == 'm') {
                if (now <= 3) {
                    System.out.println("NO");
                    return;
                }
                now -= 4;
                if (!inp.substring(now, now + 5).equals("dream")) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentChar == 'e') {
                if (now <= 3) {
                    System.out.println("NO");
                    return;
                }
                now -= 4;
                if (!inp.substring(now, now + 5).equals("erase")) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentChar == 'r') {
                if (now <= 0) {
                    System.out.println("NO");
                    return;
                }
                now--;
                if (inp.charAt(now) == 'e') {
                    if (now <= 0) {
                        System.out.println("NO");
                        return;
                    }
                    now--;
                    if (inp.charAt(now) == 'm') {
                        if (now <= 3) {
                            System.out.println("NO");
                            return;
                        }
                        now -= 4;
                        if (!inp.substring(now, now + 7).equals("dreamer")) {
                            System.out.println("NO");
                            return;
                        }
                    } else if (inp.charAt(now) == 's') {
                        if (now <= 2) {
                            System.out.println("NO");
                            return;
                        }
                        now -= 3;
                        if (!inp.substring(now, now + 6).equals("eraser")) {
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
            now--;
        }

        System.out.println("YES");
    }
}