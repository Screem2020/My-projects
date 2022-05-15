package Anotation.RemoteControl;

import java.lang.reflect.Method;
import java.util.Comparator;

public class AudioPlayer implements Comparator<Method> {
    @Control(number = 1, menultemName = "Включить первый трек")
    public void playFirstTrack() {
        System.out.println("Включить первый трек");
    }

    @Control(number = 2, menultemName = "Включить второй трек")
    public void playSecondTrack() {
        System.out.println("Включить второй трек");
    }

    @Control(number = 3, menultemName = "Включить плеер")
    public void playerOn() {
        System.out.println("Включить плеер");
    }

    @Control(number = 4, menultemName = "Выключить плеер")
    public void playerOff() {
        System.out.println("Выключить плеер");
    }

    @Override
    public int compare(Method o1, Method o2) {
        return o1.getDeclaredAnnotation(Control.class).number() - (o2.getDeclaredAnnotation(Control.class).number());
    }
}

