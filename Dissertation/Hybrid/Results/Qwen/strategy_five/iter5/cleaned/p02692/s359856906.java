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
        int[] abc = new int[3];
        abc[0] = Integer.parseInt(parts[1]);
        abc[1] = Integer.parseInt(parts[2]);
        abc[2] = Integer.parseInt(parts[3]);
        
        // Initialize variables
        String out = "Yes";
        String s1 = "";
        String s2 = "";
        int j1 = 0, j2 = 0, j3 = 0, j4 = 0;
        String cAbc = "ABC";
        char[] o = new char[n];
        
        // Loop through each iteration
        for (int i = 1; i <= n && !out.equals("No "); i++) {
            if (i == n) {
                s2 = "  ";
            } else {
                System.out.print("Enter S2: ");
                s2 = scanner.nextLine();
            }
            
            switch (s1) {
                case "AB":
                    j1 = 0;
                    j2 = 1;
                    break;
                case "AC":
                    j1 = 0;
                    j2 = 2;
                    break;
                case "BC":
                    j1 = 1;
                    j2 = 2;
                    break;
                default:
                    if (i == 1) { // Allow first S1 input to be invalid
                        s1 = s2;
                        continue;
                    }
                    throw new IllegalArgumentException("Invalid S1 value");
            }
            
            if (abc[j1] == 0 && abc[j2] == 0) {
                out = "No ";
            } else if (abc[j1] < abc[j2]) {
                continue;
            } else if (abc[j1] > abc[j2]) {
                j3 = j2;
                j2 = j1;
                j1 = j3;
            } else if (abc[j1] == 1 && abc[j2] == 1) {
                switch (s2) {
                    case "AB":
                        j3 = 0;
                        j4 = 1;
                        break;
                    case "AC":
                        j3 = 0;
                        j4 = 2;
                        break;
                    case "BC":
                        j3 = 1;
                        j4 = 2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid S2 value");
                }
                
                if (j1 == j3 || j2 == j4) {
                    continue;
                } else {
                    j1 = j2;
                    j2 = j3;
                }
            }
            
            abc[j1]++;
            abc[j2]--;
            o[i - 1] = cAbc.charAt(j1);
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