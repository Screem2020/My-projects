package Anotation.GameNum;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Colculator {

    @Test.MyTest
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ColcularNew colcularNew = new ColcularNew();
        Class<ColcularNew> colcularNewClass = ColcularNew.class;
        Method[] declaredMethods = colcularNewClass.getDeclaredMethods();
        Method method = null;
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Test.MyTest.class)) {
                method = declaredMethod;
            }
        }
        System.out.println(method != null ? method.invoke(colcularNew, a, b) : null);
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