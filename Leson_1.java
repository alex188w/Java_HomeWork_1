import java.util.Scanner;

public class Leson_1 {

    public static void main(String[] args) {
        // Factorial();
        // SimpeNumber();
        Calculator();
    }

    // Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (проижведение
    // чисел от 1 до n)
    public static void Factorial() {
        Scanner iScacanner = new Scanner(System.in, ("cp866"));
        System.out.printf("Введите число n: ");
        int n = iScacanner.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Сумма чисел от 1 до n равна: " + sum);

        int mult = 1;
        for (int i = 1; i < n + 1; i++) {
            mult *= i;
        }
        System.out.println("Произведение чисел от 1 до n равно: " + mult);
    }

    // вывести все простые числа от 1 до 1000
    public static void SimpeNumber() {
        System.out.print(2 + " ");
        A: for (int n = 3; n <= 1000; n += 2) {
            // n += 2 - т.к. все четные чисоа не являются простыми по определению; n = 3 -
            // чтобы исключить 1 (не является простым числом)
            for (int m = 2; m <= n / 2; m++) {
                if (n % m == 0) {
                    continue A;
                }
            }
            System.out.print(n + " ");
        }
    }

    // Реализовать простоф калькулятор
    public static void Calculator() {
        Scanner iScacanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double a = iScacanner.nextInt();
        System.out.printf(
                "Введите знак для действия с числами: '+' - сложение, '-' - вычитание, '/' - разделить, '*' - умножить ");
        String choice = iScacanner.next();
        System.out.printf("Введите второе число: ");
        double b = iScacanner.nextDouble();
        double res = 0;
        switch (choice) {
            case ("+"):
                res = a + b;
                break;

            case ("-"):
                res = a - b;
                break;

            case ("/"):
                res = a / b;
                break;

            case ("*"):
                res = a * b;
                break;

            default:
                break;
        }
        System.out.printf("\nРезультат выражения:\n ");
        System.out.printf(a + " " + choice + " " + b + " = " + res);
    }

    // Реализовать простоф калькулятор
    //public static void Calculator()

}