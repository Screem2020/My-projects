package Lamda_expressions.ex2_anony_class;

import java.util.Arrays;

public class Main {
    // Создать функциональный интерфейс с методом
    //T apply(int[] arr)
    //Создать два анонимных класса:
    //1. Метод возвращает среднее арифметическое всех элементов массива
    //2. Метод возвращает реверс массив (массив в обратном порядке)
    public static void main(String[] args) {
        int[] ints = {3, 43, -22, 56, 23, 556, 23, -2, 45};
        SunInterface<Integer> integerSunInterface = new SunInterface<>() {
            @Override
            public Integer apply(int[] arr) {
                int sum = 0;
                for (int j : arr) {
                    sum += j;
                }
                return sum / arr.length;
            }
        };
        SunInterface<Double> sunInterface = arr -> {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return (double)sum / arr.length;
        };


        SunInterface<int[]> integerSunInterface1 = new SunInterface<>() {
            @Override
            public int[] apply(int[] arr) {
                int[] arr1 = new int[arr.length];
                int j = 0;
                for (int i = arr.length-1; i >= 0; i--) {
                        arr1[j] = arr[i];
                        j++;
                }
                return arr1;
            }
        };
        //TODO: как можно решить задачу без for
        SunInterface<int[]> integerSunInterface2 = arr -> {
            int[] arr2 = new int[arr.length];
            int index = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                arr2[index] = arr[i];
                index++;
            }
            return arr2;
        };

        System.out.println(integerSunInterface.apply(ints));
        System.out.println(sunInterface.apply(ints));

        System.out.println(Arrays.toString(integerSunInterface1.apply(ints)));
        System.out.println(Arrays.toString(integerSunInterface2.apply(ints)));
    }
}
