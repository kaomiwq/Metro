import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение чисел:" );

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if(firstNumber>secondNumber) {
            if (firstNumber % secondNumber == 0) {
                System.out.println("Первое число кратно второму");
            } else {
                System.out.println("Первое число не кратно второму");
                System.out.println("Остаток от деления = " + firstNumber % secondNumber);
            }
        }else {
            if (secondNumber % firstNumber == 0) {
                System.out.println("Второе число кратно первому");
            } else {
                System.out.println("Второе число не кратно первому");
                System.out.println("Остаток от деления = " + secondNumber % firstNumber);
            }
        }
    }
}