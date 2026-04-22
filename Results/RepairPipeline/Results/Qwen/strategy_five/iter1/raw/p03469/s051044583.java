```java
public class Already {
    public static void main(String[] args) {
        // Declare a string variable with a fixed length of 10 characters
        char[] sArray = new char[10];
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = ' ';
        }
        String s = new String(sArray);

        // Read input from the user (assuming it's provided as a command-line argument)
        if (args.length > 0) {
            s = args[0];
        }

        // Replace the first 4 characters with "2018"
        s = "2018" + s.substring(4);

        // Print the modified string
        System.out.println(s.trim());
    }
}
```