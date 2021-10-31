package Strings.ex2;

import java.util.Objects;

public class SocialProfile {
    private String name;
    private String twoName;
    private String age;
    private String postal;
    private String country;

    public SocialProfile(String name, String twoName) {
        this.name = name;
        this.twoName = twoName;
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

    public static SocialProfile trim(String line, String[] strings1) {
        String[] strings = line.split(" ");
        int i;
        for (i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
            strings1[i] = strings[i];
        }
        if (i == 2) {
            String name = strings1[0];
            String last_name = strings1[1];
            return new SocialProfile(name, last_name);
        }
        if (i == 3) {
            String name = strings1[0];
            String last_name = strings1[1];
            String age = strings1[2];
            return new SocialProfile(name, last_name, age);
        }
        if (i == 5) {
            String name = strings1[0];
            String last_name = strings1[1];
            String age = strings1[2];
            String postal = strings1[3];
            String country = strings1[4];
            return new SocialProfile(name, last_name, age, postal, country);
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getTwoName() {
        return twoName;
    }

    public String getAge() {
        return age;
    }

    public String getPostal() {
        return postal;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialProfile that = (SocialProfile) o;
        return age.equals(that.age) && Objects.equals(name, that.name) && Objects.equals(twoName, that.twoName) &&
                Objects.equals(postal, that.postal) && Objects.equals(country, that.country);
    }

    @Override
    public String toString() {
        return "SocialProfile{" +
                "name='" + name + '\'' +
                ", twoName='" + twoName + '\'' +
                ", age=" + age +
                ", postal='" + postal + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
