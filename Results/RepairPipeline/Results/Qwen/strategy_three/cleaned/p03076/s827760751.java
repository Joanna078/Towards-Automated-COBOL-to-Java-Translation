public class Main {
    public static void main(String[] args) {
        int n2w = 10;
        int gk = 0, m1 = 0, m2 = 0;
        
        for (int i = 1; i <= 5; i++) {
            int n = readInput(); // Simulate input reading
            
            double w1 = n * 10.9;
            
            if (n2w > 0 && n % 10 < n2w) {
                gk += m1 - m2 + n;
                m1 = (int) w1;
                m2 = n;
                n2w = n % 10;
            } else {
                gk += w1;
            }
        }
        
        String out = String.format("%03d", gk);
        System.out.println(out);
    }

    private static int readInput() {
        // Implement input reading logic here
        return 0; // Placeholder
    }
}