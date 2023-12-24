import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x: ");

        int x = scanner.nextInt();
        int function = x*x - 5;
        int y = function;
        System.out.println("Значение функции: " + "x * x - 5");

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}