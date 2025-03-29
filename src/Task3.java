import java.util.Scanner;


public class Task3 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) { //6k+-1 method contains numbers that dont divide on 2 and 3 ( n=1; 6*1-1 = 5, 6*1+1=7,etc)
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        boolean result = isPrime(n);
        System.out.println(n + (result ? " — простое число" : " — не простое число"));
    }

    // time complexity: O(sqrt(n))
}
