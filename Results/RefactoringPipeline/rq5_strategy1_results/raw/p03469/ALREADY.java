```java
import java.io.UnsupportedEncodingException;

public class ALREADY {

    private boolean initialized = false;
    private int returnCode = 0;
    private String s = "          ";

    public static void main(String[] args) {
        ALREADY already = new ALREADY();
        already.execute();
    }

    public void execute() {
        if (!initialized) {
            initialized = true;
            s = "2018      ";
        }
        display(s);
        System.exit(returnCode);
    }

    private void display(String message) {
        System.out.println(message);
    }
}
```