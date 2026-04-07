import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(a * b.doubleValue()));
    }
}
