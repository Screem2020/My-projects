package Reflection.ConsolCLass;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Entered name java Class");
        String nameClass = scn.next();
        java.lang.Class<?> clazz = java.lang.Class.forName(nameClass);
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("Get type: " + declaredField.getType());
            System.out.println("Get name: " + declaredField.getName());
            System.out.println("----------------------------------------");
        }
    }
}
