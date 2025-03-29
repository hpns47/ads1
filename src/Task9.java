import java.util.Scanner;
public class Task9 {
    // returns C(n, k) by formula  using recursion
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("C(" + n + ", " + k + ") = " + binomial(n, k));
    }

    // time complexity: O(2^n)
}