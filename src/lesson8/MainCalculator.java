package lesson8;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) throws Exception {
        double rezult = 0;
        Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("Введите первое число");
            double num1 = scanner.nextDouble();
            System.out.println("Введите арифметическое действие: +, -, *, /");
            String sign = scanner.next();
            if ((!(sign.contains("+") || sign.contains("-") || sign.contains("*") || sign.contains("/"))) || sign.length() != 1) {
                throw new Exception("Введено неверное арифметическое действие");
            }
            System.out.println("Введите второе число");
            double num2 = scanner.nextDouble();
            if (sign.contains("+")) {
                rezult = num1 + num2;
            } else if (sign.contains("-")) {
                rezult = num1 - num2;
            } else if (sign.contains("*")) {
                rezult = num1 * num2;
            } else if (sign.contains("/")) {
                rezult = num1 / num2;
                if (num2 == 0) {
                    throw new DivisionBy0Exception();
                }
            }
        } catch (DivisionBy0Exception e) {
            throw new ArithmeticException();
        } catch (RuntimeException e) {
            throw new IncorrectInputException(e);

        }

        System.out.println(rezult);
    }
}
