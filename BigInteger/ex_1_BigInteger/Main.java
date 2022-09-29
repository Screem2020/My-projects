package BigInteger.ex_1_BigInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class Main {
    //Реализовать свой класс BigInt с методами сложения и вычитания.
    public static void main(String[] args) {
//        BigInteger bigInteger = BigInteger.valueOf(100000);
//        BigInteger bigInteger1 = BigInteger.valueOf(1000000000);
//        BigInteger bigInteger2 = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000233333");
//        BigInteger bigInteger3 = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000233333");
//        BigInteger add = bigInteger2.add(bigInteger3);
//        System.out.println(add);
//        BigInteger subtract = bigInteger.add(bigInteger1);
//        System.out.println(subtract);
//        System.out.println("--------------------------------");
        BigInt bigInt = new BigInt("11000");
        BigInt bigInt1 = new BigInt("100999");
        int[] ints = bigInt.parserString();
        int[] ints1 = bigInt1.parserString();
        sum(ints, ints1);

//        BigInteger sum = bigInt.sum(bigInt1);
//        System.out.println(sum);
        //1000
        //  20
        //1020

    }

    @ToString
    @Getter
    @AllArgsConstructor
    public static class BigInt {
        private String val;

        public int[] parserString() {
            String s = String.valueOf(val);
            String[] split = s.split("");
            int[] arr = new int[sizeString()];
            for (int i = 0; i < split.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            return arr;
        }

        public int sizeString() {
            String[] split = val.split("");
            return split.length;
        }
    }

    public static void sum(int[] arr1, int[] arr2) {
        int sizeArr1 = arr1.length;
        int sizeArr2 = arr2.length;
        int size = Math.max(arr1.length, arr2.length);
//        int sizeMin = Math.min(arr1.length, arr2.length);
        int[] arr3 = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            if (sizeArr1 > sizeArr2) {
                arr3[i] = arr1[i] + arr2[i];
            } else
                arr3[i] = arr2[i] + arr1[i];
            for (int j : arr3) {
                System.out.print(j);
            }
//        for (int i = size - 1; i >= 0; i--) {
//            System.out.print(arr3[i]);
//        }
        }


        // проверка длины числа, к какому необходимо прибавлять
//        int size = Math.max(arr1.length, arr2.length);
//        int[] arr3 = new int[3];
//        for (int i = size; i != 0; i--) {   // реверсное сложение чисел и пернос десятков, если такие есть
//            if (arr1[i] + arr2[i] > 9) {
//                arr1[i] = arr1[i] - 10;
//                arr3[i] = arr1[i] + arr2[i];
//            } else {
//                arr3[i] = arr1[i] + arr2[i];
//        }
//        //TODO: реализация методов вычитания и сложения
//        for (int j : arr3) {
//            System.out.println(j);
//        }
//        public BigInteger division(BigInt val1) {
//
//        }
    }
}
