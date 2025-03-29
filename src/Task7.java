import java.util.Scanner;


public class Task7 {
    // print values in reverse using recursion of function
    public static void reversePrint(int n, Scanner scanner) {
        if (n == 0) return;
        int x = scanner.nextInt();
        reversePrint(n - 1, scanner);
        System.out.print(x + " ");
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter count: ");
        int n = scanner.nextInt();
        System.out.println("enter numbers:");
        reversePrint(n, scanner);
    }

    // time complexity: O(n)
}