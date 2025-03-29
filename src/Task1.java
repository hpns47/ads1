import java.util.Scanner;

public class Task1{
    public static int minimumValue(int[] arr){
        int min = arr[0]; //creating minimum variable as first element of arr
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i]; //checking if other elements are smaller of first one,if they are,replacing them
            }
        }
        return min;
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

        int min = minimumValue(arr);
        System.out.println("Минимальное значение: " + min);
    }

    // time complexity: O(n) where n is array length
}

