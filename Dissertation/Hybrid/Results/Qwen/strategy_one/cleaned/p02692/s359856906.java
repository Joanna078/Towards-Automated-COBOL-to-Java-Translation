import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input string: ");
        String inp = scanner.nextLine();
        
        // Splitting input into components
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int abc1 = Integer.parseInt(parts[1]);
        int abc2 = Integer.parseInt(parts[2]);
        int abc3 = Integer.parseInt(parts[3]);
        
        // Initialize variables
        String out = "Yes";
        String s1 = ""; // Initialize s1 to avoid NullPointerException
        String s2;
        int j1, j2, j3, j4;
        String cAbc = "ABC";
        
        // Loop through each iteration
        for (int i = 1; i <= n && !out.equals("No"); i++) {
            if (i == n) {
                s2 = "  ";
            } else {
                System.out.print("Enter S2: ");
                s2 = scanner.nextLine();
            }
            
            switch (s1) {
                case "AB":
                    j1 = 1;
                    j2 = 2;
                    break;
                case "AC":
                    j1 = 1;
                    j2 = 3;
                    break;
                case "BC":
                    j1 = 2;
                    j2 = 3;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid S1 value");
            }
            
            if (abc1 == 0 && abc2 == 0) {
                out = "No";
            } else if (abc1 < abc2) {
                continue;
            } else if (abc1 > abc2) {
                j3 = j2;
                j2 = j1;
                j1 = j3;
            } else if (abc1 == 1 && abc2 == 1) {
                switch (s2) {
                    case "AB":
                        j3 = 1;
                        j4 = 2;
                        break;
                    case "AC":
                        j3 = 1;
                        j4 = 3;
                        break;
                    case "BC":
                        j3 = 2;
                        j4 = 3;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid S2 value");
                }
                
                if (j1 == j3 || j2 == j4) {
                    continue;
                } else {
                    j1 = j2;
                    j3 = j1;
                }
            }
            
            abc1++;
            abc2--;
            char[] o = new char[n];
            o[i - 1] = cAbc.charAt(j1 - 1);
            s1 = s2;
        }
        
        // Output
        System.out.println(out.trim());
        if ("Yes".equals(out)) {
            for (char ch : o) {
                System.out.println(ch);
            }
        }
        
        scanner.close();
    }
}