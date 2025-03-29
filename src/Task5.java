import java.util.Scanner;

public class Task5 {

    // finds the nth fibonacci number using recursion
    // first two numbers are 0 and 1
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        System.out.println("fibonacci number at " + n + " = " + fibonacci(n));
    }

    // time complexity: exponential, around O(2^n) because of many repeated calls
}
