import java.util.Scanner;

public class Leson_1 {

    public static void main(String[] args) {
        // Factorial();
        // SimpleNumber();
        // Calculator();
        FindTrueNumber();
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
        System.out.println();
    }

    // вывести все простые числа от 1 до 1000
    public static void SimpleNumber() {
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
        System.out.println();
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

    // *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
    // заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
    // выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
    // что его нет.
    public static void FindTrueNumber() {
        Scanner iScacanner = new Scanner(System.in);
        System.out.printf("Введите двухзначное число q (если цифра неизвестна - введите '?''): ");
        String q = iScacanner.nextLine();
        char q1 = q.charAt(0);
        char q2 = q.charAt(1);
        System.out.printf("Введите двухзначное число w (если цифра неизвестна - введите '?''): ");
        String w = iScacanner.nextLine();
        char w1 = w.charAt(0);
        char w2 = w.charAt(1);
        System.out.printf("Введите двухзначное число e (если цифра неизвестна - введите '?''): ");
        String e = iScacanner.nextLine();
        char e1 = e.charAt(0);
        char e2 = e.charAt(1);
        int q1_1;
        int q2_1;
        int w1_1;
        int w2_1;
        int e1_1;
        int e2_1;
        int correction1 = 0;
        int correction2 = 0;
        int correction3 = 0;

        if (q1 == '?') {
            q1_1 = (int) e1 - (int) w1;
        } else {
            q1_1 = Character.digit(q1, 10);
        }

        if (q2 == '?') {
            q2_1 = (int) e2 - (int) w2;
            if (q2_1 < 0) {
                q2_1 = 10 + ((int) e2 - (int) w2);
                correction1 = -1;
            }
        } else {
            q2_1 = Character.digit(q2, 10);
        }

        if (w1 == '?') {
            w1_1 = (int) e1 - (int) q1;
        } else {
            w1_1 = Character.digit(w1, 10);
        }

        if (w2 == '?') {
            w2_1 = (int) e2 - (int) q2;
            if (w2_1 < 0) {
                w2_1 = 10 + ((int) e2 - (int) q2);
                correction2 = -1;
            }
        } else {
            w2_1 = Character.digit(w2, 10);
        }

        if (e1 == '?') {
            e1_1 = q1_1 + w1_1;
        } else {
            e1_1 = Character.digit(e1, 10);
        }

        if (e2 == '?') {
            e2_1 = q2_1 + w2_1;
            if (e2_1 > 9) {
                e2_1 = (q2_1 + w2_1) - 10;
                if (q1 == '?') {
                    correction2 = -1;
                }
                if (w1 == '?') {
                    correction1 = -1;
                }
                if (e1 == '?') {
                    correction3 = 1;
                }                 
            }
        } else {
            e2_1 = Character.digit(e2, 10);
        }

        int num1 = (q1_1 + correction2) * 10 + q2_1;
        int num2 = (w1_1 + correction1) * 10 + w2_1;
        int num3 = (e1_1 + correction3) * 10 + e2_1;

       
        System.out.println(correction1);
        System.out.println(correction2);
        System.out.println(correction3);
        // System.out.println(num3);
        System.out.println("Верное восстановленное равенство имеет вид: ");
        System.out.println(num1 + " + " + num2 + " = " + num3);

    }

}