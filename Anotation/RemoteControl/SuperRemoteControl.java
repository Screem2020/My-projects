package Anotation.RemoteControl;

import java.lang.reflect.Method;
import java.util.*;

class MethodComparator implements Comparator<Method>{

    @Override
    public int compare(Method o1, Method o2) {
        return o1.getDeclaredAnnotation(Control.class).number()-o2.getDeclaredAnnotation(Control.class).number();
    }
}

public class SuperRemoteControl {
    public void control(Object ob) throws Exception {
        List<Method> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        Class<?> clazz = ob.getClass();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        //able
        //tor


        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Control.class))  {
                list.add(declaredMethod);
            }
        }
        list.sort(new MethodComparator());// при переопределенном компараторе выдает класс каст эксепшен
        System.out.println("Введите номер");
        int val = scn.nextInt();
        Method methodTarget = null;
        for (Method method : list) {
            if (method.getAnnotation(Control.class).number() == val) {
                methodTarget = method;
            }
        }
        //assert methodTarget != null;
        methodTarget.invoke(ob);
    }
}


