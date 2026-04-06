import java.util.Scanner;

public class AisingA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter INP: ");
        String inp = scanner.nextLine();
        
        // Parsing
        String[] parts = inp.split(" ");
        int l = Integer.parseInt(parts[0]);
        int r = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);
        
        // Logic
        int cnt;
        if (d == 1) {
            cnt = r - d + 1;
        } else {
            cnt = 0;
            for (int i = 1; ; i++) {
                if (d * i > r) break;
                if (d * i >= l && d * i <= r) {
                    cnt++;
                }
            }
        }
        
        // Output
        System.out.println(cnt);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Parsing**: Used `split` method to parse the input string into individual components.
3. **Logic**: Translated the COBOL logic into equivalent Java syntax.
4. **Output**: Used `System.out.println` to display the result directly.
5. **Comments**: Added comments to explain complex logic sections.