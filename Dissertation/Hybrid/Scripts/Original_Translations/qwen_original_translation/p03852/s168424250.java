public class VowelConsonantChecker {
    public static void main(String[] args) {
        // Define the character to check
        char c = 'a'; // This should be set based on actual input

        // Check if the character is a vowel or consonant
        if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}