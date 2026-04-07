import java.util.Scanner;

public class ABC_075_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        char[][] field = new char[h][w];
        for (int i = 0; i < h; i++) {
            field[i] = scanner.nextLine().toCharArray();
        }

        // Directions arrays
        int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
        int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (field[i][j] == '#') {
                    sb.append('#');
                } else {
                    int count = 0;
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < h && ny >= 0 && ny < w && field[nx][ny] == '#') {
                            count++;
                        }
                    }
                    sb.append(count);
                }
            }
            System.out.println(sb.toString());
            sb.setLength(0); // Clear the StringBuilder for the next line
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statements have been replaced with Java's `Scanner` class to read input from the console.
2. **Data Structures**: Arrays and loops have been used to replace COBOL's OCCURS clauses and PERFORM loops.
3. **String Manipulation**: The COBOL `UNSTRING` and `STRING` operations have been replaced with Java's `StringBuilder`.
4. **Direction Arrays**: The direction arrays `dx` and `dy` have been defined to handle the movement logic.
5. **Looping and Conditionals**: The COBOL `PERFORM` and `IF` statements have been translated into Java's `for` loops and `if` conditions.
6. **Output**: The `DISPLAY` statement has been replaced with `System.out.println`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and using Java 17 features where applicable.