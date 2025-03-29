import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу (1-10): ");
        int choice = scanner.nextInt(); 

        switch (choice) {
            case 1:
                Task1.run();
                break;
            case 2:
                Task2.run();
                break;
            case 3:
                Task3.run();
                break;
            case 4:
                Task4.run();
                break;
            case 6:
                Task6.run();
                break;
            case 7:
                Task7.run();
                break;
            case 8:
                Task8.run();
                break;
            case 9:
                Task9.run();
                break;
            case 10:
                Task10.run();
                break;
            default:
                System.out.println("net zadachi");
        }
    }
}
