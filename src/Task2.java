import java.util.Scanner;


public class Task2 {
    public static double average(int n,int[] arr){
        if(n==0) return 0; //divisible by zero
        int sum = 0;
        for (int num: arr){
            sum+=num; //for each element of arr,the loop adds it to variable sum
        }
        return (double) sum/n;

    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double avg = average(n, arr);
        System.out.println("Среднее значение: " + avg);
    }
    // time complexity: O(n)
}
