import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x, y и радиуса: ");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double radius = scanner.nextDouble();
        double distance = x*x + y*y;

        System.out.println(" ");

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Радиус = " + radius);

        if(distance>radius){
            System.out.println("Точка не принадлежит кругу.");
        }else {
            System.out.println("Точка принадлежит кругу. ");
        }
    }
}
