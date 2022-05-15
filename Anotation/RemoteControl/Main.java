package Anotation.RemoteControl;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        SuperRemoteControl superRemoteControl = new SuperRemoteControl();
        AudioPlayer audioPlayer = new AudioPlayer();
        Tv tv = new Tv();
        int input = 0;
        System.out.println("Выберите название нужного функционала");
        while (input != 3) {
            System.out.println("""
                    1. Audio Player
                    2. TV
                    3. Close
                    """);
            input = scn.nextInt();
            if (input == 1) {
                superRemoteControl.control(audioPlayer);
            }
            if (input == 2) {
                superRemoteControl.control(tv);
            }
        }








//

    }
}
