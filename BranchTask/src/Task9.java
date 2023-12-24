import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - прямоугольник, 2 - треугольник, 3 - круг");

        int action = 0;
        boolean inputResult = false;

        double S = 0;

        do {
            try {
                inputResult = true;

                System.out.print("Введите решаемую задачу 1,2,3: ");
                action = scanner.nextInt();

                if (action < 1 || action > 3) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);

        switch(action){
            case 1:
                System.out.println("Введите длины сторон: ");
                double firstSide = scanner.nextInt();
                double secondSide = scanner.nextInt();
                S = firstSide*secondSide;

                System.out.println("Длины сторон: " + firstSide + " " + secondSide);
                System.out.println("Площадь: " + S);
                break;
            case 2:
                System.out.println("Введите длины сторон: ");
                double firstSideTriangle = scanner.nextInt();
                double secondSideTriangle = scanner.nextInt();
                double thirdSideTriangle = scanner.nextInt();

                double p = (firstSideTriangle+secondSideTriangle+thirdSideTriangle)/2;
                p = p*(p-firstSideTriangle)*(p-secondSideTriangle)*(p-thirdSideTriangle);
                S = Math.sqrt(p);

                System.out.println("Длины сторон: " + firstSideTriangle + " " + secondSideTriangle+ " " + thirdSideTriangle);
                System.out.println("Площадь: " + S);
                break;
            case 3:
                System.out.println("Введите длину диаметра: ");
                double diameter = scanner.nextInt();
                double P = 3.14;
                S = (diameter*diameter)/4 * P;

                System.out.println("Диаметр: " + diameter);
                System.out.println("площадь: " + S);

        }

    }
}