package Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 2. Создать enum Color с константами: Белый, Синий, Красный, Зеленый
     * Создать класс Rectangle с полями
     * private Color color
     * private int a,b
     * Остальную структуру класса дополнить по необходимости.
     * В мейне создать список List<Rectangle> и создать консольное меню:
     * 1. Добавить фигуру (пользователь вводит с консоли стороны и цвет)
     * 2. Вывести все фигуры определенного цвета (пользователь вводит цвет)
     * 3. Проверить наличие фигуры в списке (пользователь вводит стороны фигуры и цвет.
     * Две фигуры считаются равными, если совпадают стороны и цвет)
     * 4. Выход
     */
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        int input = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 4) {
            System.out.println(
                    " 1. Добавить фигуру\n" +
                            " 2. Вывести все фигуры определенного цвета\n" +
                            " 3. Проверить наличие фигуры в списке\n" +
                            " 4. Выход");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("add A side rectangle");
                    int sideA = scn.nextInt();
                    System.out.println("add B side rectangle");
                    int sideB = scn.nextInt();
                    System.out.println("add color");
                    String color = scn.next();
                    Color color1 = Color.retColor(color);
                    Rectangle rectangle = new Rectangle(color1, sideA, sideB);
                    rectangles.add(rectangle);
                    System.out.println("good");
                    break;
                }
                case 2: {
                    Color color = null;
                    while (color == null) {
                        System.out.println("add color rectangle");
                        String col = scn.next();
                        color = Color.retColor(col);
                    }
                    Rectangle rectangle = new Rectangle(color);
                    boolean flag = false;
                    for (int i = 0; i < rectangles.size(); i++) {
                        Rectangle foundCol = rectangles.get(i);
                        if (foundCol.equals(rectangle)){
                            System.out.println(rectangles.get(i));
                            flag = true;
                        }
                        if (!flag) {
                            System.out.println(" not found");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("add A side rectangle");
                    int sideA = scn.nextInt();
                    System.out.println("add B side rectangle");
                    int sideB = scn.nextInt();
                    System.out.println("add color");
                    String color = scn.next();
                    Color color1 = Color.retColor(color);
                    Rectangle rectangle = new Rectangle(color1, sideA, sideB);
                    boolean flag = false;
                    for (int i = 0; i < rectangles.size(); i++) {
                        if (rectangles.get(i).equals(rectangle)) {
                            System.out.println(rectangles.get(i));
                            System.out.println("found");
                            flag = true;
                        }
                    }if (!flag) {
                        System.out.println("rectangle not found");
                    }
                    break;
                }
            }
        }
    }
}
