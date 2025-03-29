import java.util.Scanner;

public class Task6 {
    // returns power of n number with decrement and while loop,that must be > 0
    public static long powerOfNumber(int power,int n){
        long result = 1;
        while (power!=0){
            result*=n;
            --power; 
        }
        return result;


    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.print("Введите степень: ");
        int power = scanner.nextInt();

        long result = powerOfNumber(power, n);
        System.out.println(n + " ^ " + power + " = " + result);
    }
}
