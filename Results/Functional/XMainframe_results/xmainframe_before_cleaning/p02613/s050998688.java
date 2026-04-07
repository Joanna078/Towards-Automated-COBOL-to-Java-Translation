import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        int[] C = new int[4];
        Arrays.fill(C, 0);
        for (int i = 0; i < N; i++) {
            switch (S[i]) {
                case "AC":
                    C[0]++;
                    break;
                case "WA":
                    C[1]++;
                    break;
                case "TLE":
                    C[2]++;
                    break;
                case "RE":
                    C[3]++;
                    break;
            }
        }
        System.out.println("AC x " + C[0]);
        System.out.println("WA x " + C[1]);
        System.out.println("TLE x " + C[2]);
        System.out.println("RE x " + C[3]);
    }
}