package Files.ex_3_CarBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Car {

    private String brand;
    private String model;
    private String number;

    public Car(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static List <Car> loadCarFromList() {
        List <Car> list = new ArrayList<>();
        String way = "src\\Files\\ex_3_CarBase\\ListCar.txt";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                String brend = split[0];
                String model = split[1];
                String number = split[2];
                list.add(new Car(brend, model, number));
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return list;
    }

    public static void saveCarFromList(List <Car> list) {
        String way = "src\\Files\\ex_3_CarBase\\ListCar.txt";
        File file = new File(way);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Car car : list) {
                printWriter.println( car.brand + ", " + car.model + ", " + car.number); //необходимо разобраться с пробелами
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(brand).append(model).append(number).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }
}
