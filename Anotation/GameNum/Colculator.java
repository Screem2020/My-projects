package Anotation.GameNum;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Colculator {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter one number");
        int a = scanner.nextInt();
        System.out.println("enter two number");
        int b = scanner.nextInt();
        Colc colc = new Colc();
        Class<? extends Colc> colcularNewClass = colc.getClass();
        Method[] declaredMethods = colcularNewClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Test.MyTest.class)) {
                System.out.println(declaredMethod.invoke(colc, a, b));
            }
        }
    }

    static class ColcularNew {
        public int sumNum(int a, int b) {
            return a + b;
        }

        public int minusNum(int a, int b) {
            return a - b;
        }
    }

    static class Colc {
        ColcularNew colcularNew = new ColcularNew();

        @Test.MyTest
        boolean minNumTest(int a, int b) {

            int expected = a - b;
            int actual = colcularNew.minusNum(a, b);
            return actual == expected;
        }

        @Test.MyTest
        boolean sumNumTest(int a, int b) {
            int expected = a + b;
            int actual = colcularNew.sumNum(a, b);
            return actual == expected;
        }
    }
}