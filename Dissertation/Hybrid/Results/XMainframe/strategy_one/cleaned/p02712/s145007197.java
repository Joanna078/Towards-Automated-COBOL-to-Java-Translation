import java.util.Scanner;

public class Program_Id {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long dvd, qt, c, c1, c3, c5, c15, accum;
        String zs;

        dvd = 1;
        qt = n / dvd;
        c = (dvd + (qt * dvd)) * qt / 2;
        c1 = c;

        dvd = 3;
        qt = n / dvd;
        c = (dvd + (qt * dvd)) * qt / 2;
        c3 = c; // Assign c to c3

        dvd = 5;
        qt = n / dvd;
        c = (dvd + (qt * dvd)) * qt / 2;
        c5 = c;

        dvd = 15;
        qt = n / dvd;
        c = (dvd + (qt * dvd)) * qt / 2;
        c15 = c;

        accum = c1 - c3 - c5 + c15;
        zs = Long.toString(accum);
        System.out.println(zs.trim());
    }
}