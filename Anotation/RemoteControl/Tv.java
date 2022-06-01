package Anotation.RemoteControl;

import java.lang.reflect.Method;
import java.util.Comparator;

public class Tv {
    @Control(number = 1,menultemName = "Включить первый канал")
    public void switchToOne() {
        System.out.println("Включить первый канал");
    }
    @Control(number = 2,menultemName = "Включить второй канал")
    public void switchToTwo() {
        System.out.println("Включить второй канал");

    }
    @Control(number = 3,menultemName = "Включить третий канал")
    public void switchToThree() {
        System.out.println("Включить третий канал");

    }
    @Control(number = 4,menultemName = "Включить следующий  канал")
    public void switchToNext() {
        System.out.println("Включить следующий канал");

    }
    @Control(number = 5,menultemName = "Включить предедущий канал")
    public void switchToPrev() {
        System.out.println("Включить предыдущий канал");

    }
    @Control(number = 6,menultemName = "Включить телевизор")
    public void switchToOn() {
        System.out.println("Включить телевизор канал");

    }
    @Control(number = 7,menultemName = "Выключить телевизор")
    public void switchToOff() {
        System.out.println("Выключить телевизор");

    }

}
