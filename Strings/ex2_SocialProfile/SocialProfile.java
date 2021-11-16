package Strings.ex2_SocialProfile;

import java.util.Objects;

public class SocialProfile {
    private String name;
    private String twoName;
    private String age;     // при проверке по equals вылетает NullPointerException необходимо
    private String postal;  // явно инициализировать обЬект в конструкторе, даже если не прописанны, но есть в полях
    private String country;

    public SocialProfile(String name, String twoName) {
        this.name = name;
        this.twoName = twoName;
        this.age = "";
        this.postal = "";
        this.country = "";
    }

    public SocialProfile(String name, String twoName, String age) {
        this.name = name;
        this.twoName = twoName;
        this.age = age;
        this.postal = "";
        this.country = "";
    }

    public SocialProfile(String name, String twoName, String age, String postal, String country) {
        this.name = name;
        this.twoName = twoName;
        this.age = age;
        this.postal = postal;
        this.country = country;
    }

    /**
     * Метод осуществляет поиск и добавление нужного профиля по указанным конструкторам.
     * Встроенна проверка корректности веденных данных по 3 конструкторам.
     * @param line строка веденных данных, которая будет обработана.
     */
    public static SocialProfile trim(String line) {
        String[] strings = line.split(" ");
        int i;
        for (i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        if (i == 2) {
            String name = strings[0];
            String last_name = strings[1];
            return new SocialProfile(name, last_name);
        }
        else if (i == 3) {
            String name = strings[0];
            String last_name = strings[1];
            String age = strings[2];
            return new SocialProfile(name, last_name, age);
        }
        else if (i == 5) {
            String name = strings[0];
            String last_name = strings[1];
            String age = strings[2];
            String postal = strings[3];
            String country = strings[4];
            return new SocialProfile(name, last_name, age, postal, country);
        }
        throw new RuntimeException("Data entered incorrect");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialProfile that = (SocialProfile) o;
        return age.equals(that.age) && Objects.equals(name, that.name) && Objects.equals(twoName, that.twoName) &&
                Objects.equals(postal, that.postal) && Objects.equals(country, that.country);
    }

    /**
     * Переопределенный метод вывода информации через StringBuilder;
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Last Name: ").append(twoName).append("\n");
        System.out.println("Age: " + sb.append(age));
        System.out.println("Postal: " + sb.append(postal));
        System.out.println("Country: " + sb.append(country));
        return sb.toString();
    }
}
