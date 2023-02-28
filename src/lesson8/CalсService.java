package lesson8;

import java.util.Scanner;

public class CalсService {

    public static double calculator(double num1, double num2, String sign) {

        double rezult = 0;
        try {

            if ((!(sign.contains("+") || sign.contains("-") || sign.contains("*") || sign.contains("/"))) || sign.length() != 1) {
                throw new Exception("Введено неверное арифметическое действие");
            }
            if (sign.contains("+")) {
                rezult = num1 + num2;
            } else if (sign.contains("-")) {
                rezult =num1 -  num2;
            } else if (sign.contains("*")) {
                rezult = num1 *  num2;
            } else if (sign.contains("/")) {
                rezult = num1 /  num2;
                if ( num2 == 0) {
                    throw new DivisionBy0Exception();
                }
            }
        } catch (DivisionBy0Exception e) {
            throw new ArithmeticException();
        } catch (RuntimeException e) {
            throw new IncorrectInputException(e);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(rezult);
        return rezult;
    }
}
