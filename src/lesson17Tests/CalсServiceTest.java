package lesson17Tests;

import lesson8.CalсService;
import org.junit.Assert;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class CalсServiceTest {
double num1;
double num2;
String sign;

    @org.junit.Before
    public void setUp()  {
        CalсService calсService = new CalсService();

    }

    @org.junit.Test
    public void when8Plus0Then8() {
        double num1 =8;
        double num2 = 0;
 String sign = "+";
double expected = 8;
        Assert.assertEquals(expected, CalсService.calculator(num1, num2, sign), 0.001);

    }

    @org.junit.Test(expected = RuntimeException.class)
    public void when8P0ThenException() throws RuntimeException {
        double num1 =8;
        double num2 = 0;
        String sign = "p";
         CalсService.calculator(num1, num2, sign);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void when8Divide0ThenException() throws ArithmeticException {
        double num1 =8;
        double num2 = 0;
        String sign = "/";
         CalсService.calculator(num1, num2, sign);
    }
}