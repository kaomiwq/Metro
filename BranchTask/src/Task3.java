import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четное и нечетное число: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if(firstNumber % 2 != 0){
            System.out.println(firstNumber + " - нечетное число");
        }else {
            System.out.println(secondNumber + " - нечетное число");
        }
    }
}