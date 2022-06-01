package Reflection.ref_ex3;

import java.lang.reflect.Method;
import java.util.HashMap;
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

        Object[] values = new Object[a];
        Class[] classes = new Class[a];
        int index=0;
        HashMap<String, Class> map = new HashMap<>();
        map.put("int", int.class);
        map.put("double", double.class);
        map.put("String", String.class);
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter data type: ");
            Class dataType = map.get(scn.next());
            System.out.print("Enter value: ");
            Object value;
            if(dataType == int.class){
                value = scn.nextInt();
            }
            else if(dataType == double.class){
                value = scn.nextDouble();
            }
            else{
                value = scn.next();
            }
            classes[index] = dataType;
            values[index] = value;
            index++;
        }

        Class<?> clazz = Class.forName(clazzName);
        Object obj = clazz.getConstructor().newInstance();
        Method method = clazz.getMethod(methodName, classes);
        Object invoke = method.invoke(obj, values);
        System.out.println(invoke);
    }
}
