```java
public class Main {
    public static void main(String[] args) {
        int n2w = 10;
        int gk = 0, m1 = 0, m2 = 0;
        
        for (int i = 1; i <= 5; i++) {
            int n = readInput(); // Simulate input reading
            
            double w1 = (n * 10.9) / 10;
            
            if (n > 0 && n < n2w) {
                gk += m1 - m2 + n;
                m1 = (int) w1;
                m2 = n;
                n2w = n;
            } else {
                gk += (int) w1;
            }
        }
        
        String out = String.format("%03d", gk);
        System.out.println(out.trim());
    }

    private static int readInput() {
        // Implement input reading logic here
        return 5; // Placeholder for testing, should be replaced with actual input logic
    }
}
```