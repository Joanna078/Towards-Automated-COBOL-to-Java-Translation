import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int result;
        switch (day) {
            case "SUN":
                result = 7;
                break;
            case "MON":
                result = 6;
                break;
            case "TUE":
                result = 5;
                break;
            case "WED":
                result = 4;
                break;
            case "THU":
                result = 3;
                break;
            case "FRI":
                result = 2;
                break;
            case "SAT":
                result = 1;
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + day);
        }
        System.out.println(result);
    }
}
