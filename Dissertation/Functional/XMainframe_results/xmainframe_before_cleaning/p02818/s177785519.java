import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] arr = ln.split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);
        long K = Long.parseLong(arr[2]);
        long mna = Math.min(A, K);
        A -= mna;
        K -= mna;
        mna = K;
        mnb = Math.min(B, mna);
        B -= mnb;
        String zsa = String.format("%d", A);
        String zsb = String.format("%d", B);
        String ans = zsa + " " + zsb;
        System.out.println(ans.trim());
    }
}