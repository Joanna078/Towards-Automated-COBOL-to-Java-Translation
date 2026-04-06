Here's the equivalent Java code that meets your requirements:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        double x, y, w;
        int n;
        int spaceIndex = line.indexOf(' ');
        x = Double.parseDouble(line.substring(0, spaceIndex));
        y = Double.parseDouble(line.substring(spaceIndex + 1));
        w = Double.parseDouble(line.substring(spaceIndex + 3));
        if (w >= x * y / 2.0) {
            w = w - x * y / 2.0;
            w = 2.0 * w / x;
            w = y - Math.atan(w / x) * 180.0 / 3.1415926535898;
        } else {
            w = 2.0 * w / y;
            w = Math.atan(y / w) * 180.0 / 3.1415926535898;
        }
        DecimalFormat df = new DecimalFormat("0.0000000000");
        System.out.println(df.format(w));
    }
}