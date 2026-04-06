public class ProgramId {
    public static void main(String[] args) {
        // Read character from user input
        char c = readCharacter();
        
        // Increment ASCII value of the character and convert back to character
        char incrementedChar = (char) (c + 1);
        
        // Print the incremented character
        System.out.println(incrementedChar);
    }

    private static char readCharacter() {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            return scanner.next().charAt(0);
        } catch (Exception e) {
            throw new RuntimeException("Error reading character", e);
        }
    }
}