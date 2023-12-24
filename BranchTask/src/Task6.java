import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x и y: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(" ");

        System.out.println("x = " + x);
        System.out.println("y = " + y);



        if (x>0 && y>0){
            System.out.println("Четверть I");
        } else if (x<0 && y<0) {
            System.out.println("Четверть III");
        } else if (x<0 && y> 0) {
            System.out.println("Четверть II");
        } else if (x>0 && y<0) {
            System.out.println("Четверть IV");
        } else if (x==0 || y == 0) {
            System.out.println("Точка лежит на оси");
        }
    }
}