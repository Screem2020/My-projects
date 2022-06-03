package Recursion.Regex.SystemRegistration;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<RegistrationField> clientList = new ArrayList<>();
        clientList.add(new RegistrationField("name", "1234"));
        clientList.add(new RegistrationField("name1", "1234"));
        InputOutputClient iopc = new InputOutputClient();
        iopc.loadDateClient();
        Class<?> clazzClient = Class.forName("Recursion.Regex.SystemRegistration.RegistrationField");
        int input = 0;
        while (input != 3) {
            System.out.println("""
                    1.Registration
                    2.Entered
                    3.Output
                    """);
            input = scn.nextInt();
            if (input == 1) {
                System.out.println("Entered login");
                String login = scn.next();
                if (!login.matches("\\w+")){
                    System.out.println("Invalid login");
                    continue;
                }
                scn = new Scanner(System.in);
                System.out.println("Password");
                String password = scn.next();
                RegistrationField loginAndPassClient = (RegistrationField) clazzClient
                        .getConstructor(String.class, String.class)
                        .newInstance(login, password);
                clientList.add(loginAndPassClient);
                System.out.println("User Entered in Base");
            }
        }
    }
}
