package lesson17Tests;

import lesson8.CalсService;

import java.util.Scanner;

public class Case1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите арифметическое действие: +, -, *, /");
        String sign = scanner.next();
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();
        CalсService.calculator(num1, num2, sign);
    }
}
