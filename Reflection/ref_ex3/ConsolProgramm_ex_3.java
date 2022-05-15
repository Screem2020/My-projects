package Reflection.ref_ex3;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ConsolProgramm_ex_3 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter class name");
        String clazzName = "Reflection.ref_ex3.Minus";
        System.out.println("Enter method name");
        String methodName = scn.next();

        System.out.println("Введите количество значений");
        int a = scn.nextInt();

        Object[] arr = new Object[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        Class<?> clazz = Class.forName(clazzName);
        Object obj = clazz.getConstructor().newInstance();
        Method method = clazz.getMethod(methodName, String.class, Integer.class, Double.class);
        Object invoke = method.invoke(obj, arr);
        System.out.println(invoke);
    }
}
