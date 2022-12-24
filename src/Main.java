public class Main {
    public static void main(String[] args) {
        short sh = 15000;
        byte by = 15;
        int chislo = 48;
        long l_chislo = 1000000000;
        boolean bool = true;
        float fl = (float) 0.1;
        double dbl = 10.11;
        char ch = 'f';
        System.out.println(by + " - 8-ми разрядное целое число");
        System.out.println(sh + " - короткое 16-ти разрядное целое число");
        System.out.println(chislo + " - 32-х разрядное целое число");
        System.out.println(l_chislo + " - длинное 64-х разрядное целое число");
        System.out.println(fl + " - число с плавающей запятой одинарной точности");
        System.out.println(dbl + " - число с плавающей запятой двойной точности");
        System.out.println(ch + " - это символ");
        System.out.println(bool + " - логический тип данных");
    }
}