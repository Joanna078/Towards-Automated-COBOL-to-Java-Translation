import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        
        BigInteger n = new BigInteger(parts[0]);
        BigInteger a = new BigInteger(parts[1]);
        BigInteger b = new BigInteger(parts[2]);
        
        BigInteger cnt = n.divide(a.add(b));
        
        BigInteger sumA = BigInteger.ZERO;
        BigInteger sumB = BigInteger.ZERO;
        
        if (a.equals(BigInteger.ZERO)) {
            System.out.println(0);
        } else if (b.equals(BigInteger.ZERO)) {
            System.out.println(n);
        } else {
            sumA = a.multiply(cnt);
            sumB = b.multiply(cnt);
            
            while (n.compareTo(sumA.add(sumB)) > 0) {
                sumA = sumA.add(a);
                sumB = sumB.add(b);
            }
            
            BigInteger bkCnt = sumA.add(sumB).subtract(n);
            if (bkCnt.compareTo(b) <= 0) {
                System.out.println(sumA);
            } else {
                System.out.println(sumA.subtract(bkCnt.subtract(b)));
            }
        }
        
        scanner.close();
    }
}