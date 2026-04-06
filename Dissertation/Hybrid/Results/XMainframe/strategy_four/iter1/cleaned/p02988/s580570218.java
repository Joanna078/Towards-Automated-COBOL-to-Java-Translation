import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String input = scanner.nextLine();
        int p1 = 0;
        List<Integer> numbers = new ArrayList<>();
        while (p1 < input.length()) {
            int p2 = input.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = input.length();
            }
            if (!input.substring(p1, p2).trim().isEmpty()) {
                numbers.add(Integer.parseInt(input.substring(p1, p2).trim()));
            }
            p1 = p2 + 1;
        }
        int count = 0;
        for (int i = 1; i < numbers.size() - 1; i++) {
            if ((numbers.get(i - 1) < numbers.get(i) && numbers.get(i) < numbers.get(i + 1)) ||
                    (numbers.get(i - 1) > numbers.get(i) && numbers.get(i) > numbers.get(i + 1))) {
                count++;
            }
        }
        System.out.println(count);
    }
}