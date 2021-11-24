package Files.ex_3_CarBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Car {

    private String brand;
    private String model;
    private String number;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * - Метод создает обьект в котором нобходимо изменить количество машин
     * - Берет информацию из базы и загружает в список list
     * - Затем идет поиск нового обьекта в этом сохраненном списке
     */
    public static void setNumberCar() {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter brand");
            String brand = scn.nextLine().toLowerCase(Locale.ROOT);
            System.out.println("Enter model");
            String model = scn.nextLine().toLowerCase(Locale.ROOT);
            Car car = new Car(brand, model);
            List<Car> list = loadCarFromList();
            for (int i = 0; i < list.size(); i++) {
                if (list.equals(car)) {                 //не осуществляется поиск
                    scn = new Scanner(System.in);
                    System.out.println("Enter set number car");
                    String setNumberByCar = scn.nextLine();
                    list.get(i).setNumber(setNumberByCar);
                    System.out.println("Number car correction");
                }
            }
            System.out.println("Not found");
        }catch (Exception e) {
            e.printStackTrace();
            System.err.println("Check correct entered data");
        }
    }

    /**
     * Метод берет информацию из фаила и созланяет ее в list
     * @return list - список сохраненной информации
     */
    public static List <Car> loadCarFromList() {
        List <Car> list = new ArrayList<>();
        String way = "src\\Files\\ex_3_CarBase\\ListCar.txt";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                String brand = split[0].trim();
                String model = split[1].trim();
                String number = split[2].trim();
                list.add(new Car(brand, model, number));
            }
            scn.close();
        } catch (FileNotFoundException e) {
        }
        return list;
    }

    /**
     * Метод читает полученную информацию и выводит ее на консоль
     * с помощью PrintWriter
     */
    public static void saveCarFromList(List <Car> list) {
        String way = "src\\Files\\ex_3_CarBase\\ListCar.txt";
        File file = new File(way);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Car car : list) {
                printWriter.printf("%-10s", car.brand + "," + car.model + "," + car.number + "\n"); //необходимо разобраться с пробелами
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.printf("%-5s", brand + " " + model  + " " + number);
    }
//    TODO: попытка сделать через StringBuilder
//        StringBuilder sb = new StringBuilder();
//        sb.append(brand).append(model).append(number).append("\n");
//        return sb.toString();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(number, car.number);
    }
}
