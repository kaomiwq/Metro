import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение чисел: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int max = 0;

        if (firstNumber>secondNumber){
            max = firstNumber;
        } else {
            max = secondNumber;
        }
        if (max>thirdNumber){

        }else {
            max=thirdNumber;
        }
        System.out.println("Максимальное число: ");
        System.out.println(max);
    }
}