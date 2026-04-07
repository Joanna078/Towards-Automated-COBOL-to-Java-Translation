import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int now = 0;
        
        // Find the first non-space character
        while (now < inp.length() && inp.charAt(now) == ' ') {
            now++;
        }
        
        now--; // Adjust index since we incremented one extra time
        
        // Reverse loop through the string
        while (now >= 0) {
            char currentChar = inp.charAt(now);
            
            if (currentChar == 'm') {
                if (now <= 4) {
                    System.out.println("NO");
                    return;
                }
                now -= 4;
                if (!inp.substring(now + 1, now + 6).equals("dream")) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentChar == 'e') {
                if (now <= 4) {
                    System.out.println("NO");
                    return;
                }
                now -= 4;
                if (!inp.substring(now + 1, now + 6).equals("erase")) {
                    System.out.println("NO");
                    return;
                }
            } else if (currentChar == 'r') {
                if (now <= 1) {
                    System.out.println("NO");
                    return;
                }
                now--;
                if (inp.charAt(now) == 'e') {
                    if (now <= 1) {
                        System.out.println("NO");
                        return;
                    }
                    now--;
                    if (inp.charAt(now) == 'm') {
                        if (now <= 4) {
                            System.out.println("NO");
                            return;
                        }
                        now -= 4;
                        if (!inp.substring(now + 1, now + 8).equals("dreamer")) {
                            System.out.println("NO");
                            return;
                        }
                    } else if (inp.charAt(now) == 's') {
                        if (now <= 3) {
                            System.out.println("NO");
                            return;
                        }
                        now -= 3;
                        if (!inp.substring(now + 1, now + 7).equals("eraser")) {
                            System.out.println("NO");
                            return;
                        }
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}