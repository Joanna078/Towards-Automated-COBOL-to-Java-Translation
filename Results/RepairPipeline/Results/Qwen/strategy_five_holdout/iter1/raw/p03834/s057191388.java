```java
public class ABC051A {
    public static void main(String[] args) {
        // Define a mutable string to hold the input
        StringBuilder s = new StringBuilder();

        // Simulate accepting input (in practice, this would be from user or file)
        s.append("happy,newyear,enjoy");

        // Replace all commas with spaces
        s = new StringBuilder(s.toString().replace(',', ' '));

        // Display the modified string
        System.out.println(s);

        // Exit the program
        System.exit(0);
    }
}
```