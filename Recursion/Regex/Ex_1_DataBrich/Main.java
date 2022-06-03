package Recursion.Regex.Ex_1_DataBrich;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter data brich in format dd.MM.yyyy");
        String date = scn.next();
        //12.06.1994
        String regex = "\\d{2}\\.\\d{2}\\.\\d{4}";
        boolean matches = date.matches(regex);
        if (!matches) {
            System.out.println("Invaild format");
        } else System.out.println(date);
    }
}
