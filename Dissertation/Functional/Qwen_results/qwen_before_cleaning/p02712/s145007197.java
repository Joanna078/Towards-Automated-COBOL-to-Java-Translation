import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgramId {
    public static void main(String[] args) {
        BigDecimal n = new BigDecimal("1234567890"); // Example value for N
        BigDecimal dvd = BigDecimal.ONE;
        BigDecimal c = calculate(n, dvd);
        
        dvd = BigDecimal.valueOf(3);
        c = c.subtract(calculate(n, dvd));
        
        dvd = BigDecimal.valueOf(5);
        c = c.subtract(calculate(n, dvd));
        
        dvd = BigDecimal.valueOf(15);
        c = c.add(calculate(n, dvd));
        
        BigDecimal accum = c;
        String zs = accum.stripTrailingZeros().toPlainString();
        System.out.println(zs);
    }

    private static BigDecimal calculate(BigDecimal n, BigDecimal dvd) {
        BigDecimal qt = n.divide(dvd, 0, RoundingMode.DOWN);
        return (dvd.add(qt.multiply(dvd))).multiply(qt).divide(BigDecimal.valueOf(2), 0, RoundingMode.DOWN);
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL's fixed-point and picture data types with `BigDecimal` for high precision arithmetic.
2. **Initialization**: Used `BigDecimal.ONE` for initializing `dvd`.
3. **Loop and Calculation**: The loop and calculation logic were simplified using `BigDecimal` methods.
4. **Rounding Mode**: Used `RoundingMode.DOWN` to match COBOL's integer division behavior.
5. **Display**: Used `stripTrailingZeros()` to remove trailing zeros before displaying the result.
6. **Comments**: Added comments for clarity where necessary.