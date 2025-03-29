import java.util.Scanner;

public class Task4 {
    // returns factorial of n with method of multiplying each elemtn on previous one with recursion
    public static long factorial (int n){
        if (n>=0){
            if( n==0 ||n==1) return 1;
            return n*factorial(n-1);
        }
        return 0;
    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();

        long result = factorial(n);
        System.out.println("Факториал числа " + n + " = " + result);
    }
    // time complexity: O(n)
}
