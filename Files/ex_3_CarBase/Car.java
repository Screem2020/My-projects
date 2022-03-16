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
     * - Берет информацию из списка list
     * - Затем идет поиск нового обьекта в этом списке
     */
    public static void setNumberCar(List<Car> listCar) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter brand");
            String brand = scn.nextLine().toLowerCase(Locale.ROOT);
            System.out.println("Enter model");
            String model = scn.nextLine().toLowerCase(Locale.ROOT);
            Car car = new Car(brand, model);
            System.out.println(listCar);
            boolean flag = false;
            int index = listCar.indexOf(car);

            if (index!=-1) {
                scn = new Scanner(System.in);
                System.out.println("Enter set number car");
                String setNumberByCar = scn.nextLine();
                listCar.get(index).setNumber(setNumberByCar);
                System.out.println("Number car correction");
                flag = true;

            }
            if (!flag)
                throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Check correct entered data");
        }
    }

    /**
     * Метод берет информацию из фаила и сохраняет ее в list
     *
     * @return list - список сохраненной информации
     */
    public static List<Car> loadCarFromList() {
        List<Car> list = new ArrayList<>();
        String way = "src\\Files\\ex_3_CarBase\\ListCar.txt";
        File file = new File(way);
        try {
            Scanner scn = new Scanner(file);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                String[] split = line.split(",");
                String brand = split[0];
                String model = split[1];
                String number = split[2];
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
    public static void saveCarFromList(List<Car> list) {
        String way = "src\\Files\\ex_3_CarBase\\ListCar.txt";
        File file = new File(way);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Car car : list) {
                printWriter.println(car.brand + "," + car.model + "," + car.number); //необходимо разобраться с пробелами
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.printf("%7s", brand + " " + model + " " + number + "\n");
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
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", number='" + number + '\'' +
//                '}';


        return String.format("%-7s %-7s %-7s", brand,  model,number);
    }
}
