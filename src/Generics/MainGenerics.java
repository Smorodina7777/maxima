package Generics;

import java.util.Arrays;


public class MainGenerics {
    public static <T extends Number> MaxMin<T> findMaxMin(T[] mas) {
        Arrays.sort(mas);
        T tmin = mas[0];
        T tmax = mas[mas.length - 1];
        MaxMin<T> maxMin = new MaxMin<>(tmax, tmin);
        System.out.println("Максимум - " + tmax + ", минимум - " + tmin);
        return maxMin;
    }

    public static void main(String[] args) {
        Integer[] mas = {4, 3, 5, 0, 8};
        findMaxMin(mas);
        Double[] mas2 = {4.5, 6.8, 9.0, -7.2};
        findMaxMin(mas2);

    }
}

