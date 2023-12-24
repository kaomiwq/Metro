import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int averageNumber = 0;
        boolean inputResult = false;

        do {
            try {
                inputResult = true;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите значение чисел: ");
                firstNumber = scanner.nextInt();
                secondNumber = scanner.nextInt();
                thirdNumber = scanner.nextInt();

                if (firstNumber == secondNumber || firstNumber == thirdNumber  ) {
                    throw new Exception();
                }
                if (secondNumber == thirdNumber){
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);

        if ((firstNumber - secondNumber) * (thirdNumber - firstNumber) >= 0) {
            averageNumber = firstNumber;
        } else if ((secondNumber - firstNumber) * (thirdNumber - secondNumber) >= 0) {
            averageNumber = secondNumber;
        } else {
            averageNumber = thirdNumber;
        }
        System.out.println("Среднее число: " + averageNumber);
    }
}