import java.util.Scanner;

public class Task8 {
    // returns true if all characters are digits
    public static boolean isAllDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isAllDigits(s, i + 1);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = scanner.nextLine();
        boolean result = isAllDigits(s, 0);
        System.out.println(result ? "yes" : "no");
    }

    // time complexity: O(n)
}