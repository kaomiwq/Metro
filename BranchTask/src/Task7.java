import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение сторон: ");

        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();

        if (firstSide > secondSide+thirdSide){
            System.out.println("Треугольник не существует.");
        } else if (secondSide > firstSide+thirdSide) {
            System.out.println("Треугольник не существует.");
        } else if (thirdSide > firstSide+secondSide) {
            System.out.println("Треугольник не существует.");
        }else {
            System.out.println("Треугольник существует. ");
        }
    }
}
