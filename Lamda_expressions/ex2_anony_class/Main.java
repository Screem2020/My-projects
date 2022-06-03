package Lamda_expressions.ex2_anony_class;

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


        SunInterface<Integer> integerSunInterface1 = new SunInterface<>() {
            @Override
            public Integer apply(int[] arr) {
                for (int i = arr.length - 1; i >= 0; --i) {
                    return arr[i];
                }
                return -1;
            }
        };
        SunInterface<Integer> integerSunInterface2 = arr -> {
            for (int i = arr.length - 1; i >= 0; --i) {
                return arr[i];
            }
            return -1;
        };

        System.out.println(integerSunInterface.apply(ints));
        System.out.println(sunInterface.apply(ints));

        System.out.println(integerSunInterface1.apply(ints));
        System.out.println(integerSunInterface2.apply(ints));
    }
}
