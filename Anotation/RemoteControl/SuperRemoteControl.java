package Anotation.RemoteControl;

import java.lang.reflect.Method;
import java.util.*;

public class SuperRemoteControl {
    public void control(Object ob) throws Exception {
        List<Method> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        Class<?> clazz = ob.getClass();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Control.class)) {
                list.add(declaredMethod);
            }
        }
        for (Method method : list) {
            System.out.println(method.getAnnotation(Control.class).number() + ") " + " " + method.getAnnotation(Control.class).menultemName());
        }
        System.out.println();
        System.out.println("Введите номер на плеере");
        int val = scn.nextInt();
        Method methodTarget = null;
        for (Method method : list) {
            if (method.getAnnotation(Control.class).number() == val) {
                methodTarget = method;
            }
        }
        assert methodTarget != null;
        methodTarget.invoke(clazz, val);
        System.out.println(list);


        //method.invoke(clazz, val, name);
    }
}


