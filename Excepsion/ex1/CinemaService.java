package Excepsion.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaService {

    private Scanner scn = new Scanner(System.in);
    private final int place = 5;
    private final int row = 15;
    private final Main.Symbols[][] arr = new Main.Symbols[place][row];

    /**
     * В конструкторе происходит построение структуры зала с помощью двумерного массива
     *  и его отображение в методе print
     */
    public CinemaService() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Main.Symbols.EMPTY;
            }
        }
    }

    /**
     * Метод бронирует место и осуществляет проверку на занятость с помощью checked
     * исключения TickedAlreadyReservedException,  а так же с помощью InvalidPlaceValueException
     * и InvalidRowValueException unchecked исключений производит проверку на коректность (e < 0) введеных значений
     */
    public void reserved(int placeReserved, int rowReserved) {
        try {
            if (placeReserved < 0) {
                throw new InvalidPlaceValueException("Указанно не верное место");
            }
        } catch (InvalidPlaceValueException e) {
            e.printStackTrace();
        }

        try {
            if (rowReserved < 0) {
                throw new InvalidRowValueException("Указан не верный ряд");
            }
        } catch (InvalidRowValueException e) {
            e.printStackTrace();
        }

        try {
            if (arr[placeReserved][rowReserved] != Main.Symbols.EMPTY) {
                throw new TickedAlreadyReservedException("Место занято, выберите другое");
            }
        } catch (TickedAlreadyReservedException e) {
            e.printStackTrace();
        }
        arr[placeReserved][rowReserved] = Main.Symbols.BUSY;
    }

    /**
     * Метод осуществялет сьем брони с помощью checked исключения NoExistReserveException
     * @param placeReserved - место
     * @param rowReserved - ряд
     */
    public void takeOffReserved(int placeReserved, int rowReserved) {
        try {
            if (arr[placeReserved][rowReserved] != Main.Symbols.BUSY){
                throw new NoExistReserveException("Такой брони не существует");
            }
        } catch (NoExistReserveException e) {
            e.printStackTrace();
        }
        arr[placeReserved][rowReserved] = Main.Symbols.EMPTY;
    }

    /**
     * Метод осуществляет отрисовку зала
     */
    public void print() {
        int index = 1;
        while (index < arr[0].length+1) {
            System.out.printf("%4d", index++);

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) { //строки
            System.out.print(i+1);
            for (int j = 0; j < arr[i].length; j++) { //столбцы
                //System.out.print(arr[i][j].toString());
                System.out.printf("%4s", arr[i][j].toString());
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Reservation{" +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
