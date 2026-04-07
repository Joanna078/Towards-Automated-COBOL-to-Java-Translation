import java.util.*;

public class PracticeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int work = scanner.nextInt();
        String result;
        
        if (work % 10 == 2 || work % 10 == 4 || work % 10 == 5 || work % 10 == 7 || work % 10 == 9) {
            result = "hon";
        } else if (work % 10 == 0 || work % 10 == 1 || work % 10 == 6 || work % 10 == 8) {
            result = "pon";
        } else if (work % 10 == 3) {
            result = "bon";
        } else {
            result = "";
        }
        
        System.out.println(result);
        scanner.close();
    }
}