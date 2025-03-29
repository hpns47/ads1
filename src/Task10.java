import java.util.Scanner;

public class Task10 {
    // returns gcd of a and b
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("gcd is: " + gcd(a, b));
    }

    // time complexity: O(log(min(a, b)))
}
