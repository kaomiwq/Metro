import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        int dayscount = 0;

        if (year % 4 == 0){
            dayscount = 366;
            System.out.println("Колличество дней в году: " + dayscount);
            System.out.println("Это високосный год. ");
        }else {
            dayscount = 365;
            System.out.println("Колличество дней в году: " + dayscount);
            System.out.println("Это не високосный год. ");
        }
    }
}
