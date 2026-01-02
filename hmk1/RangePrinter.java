import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printBetween(a, b);
        sc.close();
    }

    static void printBetween(int a, int b) {
        int start = Math.min(a, b) + 1;
        int end = Math.max(a, b) - 1;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printBetween(a, b);
        sc.close();
    }

    static void printBetween(int a, int b) {
        int start = Math.min(a, b) + 1;
        int end = Math.max(a, b) - 1;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
}
}
}
