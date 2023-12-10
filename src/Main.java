import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int count = 0;
        int firstStation = 0;
        int secondStation = 0;
        int minStation = 0;
        boolean inputResult = false;

        do {
            try {
                inputResult = true;

                System.out.print("Введите колличество станций: ");
                count = scanner.nextInt();

                if (count < 1 || count > 100) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        }while (!inputResult);

        do {
            try {
                inputResult = true;

                System.out.print("Введите номер первой станции: ");
                firstStation = scanner.nextInt();

                if (firstStation < 1 || firstStation > 100) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        }while (!inputResult);

        do {
            try {
                inputResult = true;

                System.out.print("Введите номер второй станции: ");
                secondStation = scanner.nextInt();

                if (secondStation < 1 || secondStation > 100) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        }while (!inputResult);

        if(count + firstStation - secondStation < secondStation - firstStation){
            System.out.println("Минимальное колличество промежуточных станций: ");
            minStation = count - secondStation;
            System.out.println(minStation);
        }else{
            System.out.println("Минимальное колличество промежуточных станций: ");
            minStation = secondStation - firstStation - 1;
            System.out.println(minStation);
        }



    }
}